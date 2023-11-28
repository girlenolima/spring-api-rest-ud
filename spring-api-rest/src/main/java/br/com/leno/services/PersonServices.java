package br.com.leno.services;

import br.com.leno.exceptions.ResourceNotFoundException;
import br.com.leno.model.Person;
import br.com.leno.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;


/*
 * @Service informar ao Spring que isso é uma classe de serviço
 *
 * */
@Service
public class PersonServices {

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public Person findByid(Long id) {

        logger.info("Find person");


        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));
    }


    public List<Person> findAll() {
        return repository.findAll();
    }

    public Person create(Person person) {

        logger.info("Create ´person");
        return repository.save(person);

    }

    public Person update(Person person) {

        logger.info("Update person");
        var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());


        return repository.save(person);

    }

    public void delete(Long id) {
        logger.info("delete person");
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No record for ID"));
        repository.delete(entity);

    }



}
