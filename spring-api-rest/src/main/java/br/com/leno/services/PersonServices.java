package br.com.leno.services;


import br.com.leno.controllers.PersonController;
import br.com.leno.data.vo.v1.person.PersonVO;
import br.com.leno.exceptions.ResourceNotFoundException;
import br.com.leno.model.Person;
import br.com.leno.repositories.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import java.util.List;
import java.util.logging.Logger;


/**
 * Service informa ao Spring que isso é uma classe de serviço
 * */
@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());
    private static final ModelMapper mapper = new ModelMapper();

    @Autowired
    PersonRepository repository;

    /*Usada pelo find all para addcionar os itens hatoaes*/
    private static void accept(PersonVO p) {
        try {
            p.add(linkTo(methodOn(PersonController.class).findById(p.getIdU())).withSelfRel());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<PersonVO> findAll() {

        return  repository.findAll()
                .stream()
                .map(person -> mapper.map(person, PersonVO.class))
                .peek(PersonServices::accept)
                .toList();

    }

    public PersonVO findByid(Long idU) throws Exception {

        logger.info("Find PersonVO");
        var entity = repository.findById(idU).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));
        var vo = mapper.map(entity, PersonVO.class);

        /*adcionando hatoes ao VO - links*/
        vo.add(linkTo(methodOn(PersonController.class).findById(idU)).withSelfRel());

        return vo;

    }


    public PersonVO create(PersonVO person) throws Exception {

        /*
         * Recebe o vo, converte para person, salva , converter para Vo e retorna.
         * */

        logger.info("Create PersonVO");
        /*Salva*/
        var vo = repository.save(mapper.map(person, Person.class));

        /*Tranforma em VO para exibir o resultado*/
        var voPeron =  mapper.map(vo, PersonVO.class);

        /*Adciona o link do hateoas*/
        voPeron.add(linkTo(methodOn(PersonController.class).findById(voPeron.getIdU())).withSelfRel());

        return voPeron;

    }
    public PersonVO update(PersonVO personVO) throws Exception {

        logger.info("Update PersonDTO");
        var entity = repository.findById(personVO.getIdU()).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));

        entity.setFirstName(personVO.getFirstName());
        entity.setLastName(personVO.getLastName());
        entity.setAddress(personVO.getAddress());
        entity.setGender(personVO.getGender());
        var person = repository.save(entity);

        var voPeron =  mapper.map(person, PersonVO.class);
        voPeron.add(linkTo(methodOn(PersonController.class).findById(voPeron.getIdU())).withSelfRel());
        return voPeron;


    }

    public void delete(Long idU) {
        logger.info("delete PersonVO");
        var entity = repository.findById(idU).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));
        repository.delete(entity);

    }


}
