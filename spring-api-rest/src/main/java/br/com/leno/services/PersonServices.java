package br.com.leno.services;

import br.com.leno.data.vo.v1.person.PersonDTO;

import br.com.leno.exceptions.ResourceNotFoundException;
import br.com.leno.model.Person;
import br.com.leno.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;


/*
 * @Service informa ao Spring que isso é uma classe de serviço
 *
 * */
@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<PersonDTO> findAll() {
        return repository.findAll().stream().map(PersonDTO::new).toList();
    }

    public PersonDTO findByid(Long id) {

        logger.info("Find PersonVO");
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));
        return new PersonDTO(entity);
    }


    public PersonDTO create(PersonDTO person) {

        logger.info("Create PersonVO");
        var vo = repository.save(new Person(person));
        return new PersonDTO(vo);
    }


    public PersonDTO update(PersonDTO personDTO) {

        logger.info("Update PersonDTO");
        var entity = repository.findById(personDTO.id()).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));

        entity.setFirstName(personDTO.firstName());
        entity.setLastName(personDTO.lastName());
        entity.setAddress(personDTO.address());
        entity.setGender(personDTO.gender());

        var person = repository.save(entity);
        return new PersonDTO(person);
    }

    public void delete(Long id) {
        logger.info("delete PersonVO");
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));
        repository.delete(entity);

    }


}
