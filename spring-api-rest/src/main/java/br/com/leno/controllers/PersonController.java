package br.com.leno.controllers;



import br.com.leno.data.vo.v1.person.PersonVO;
import br.com.leno.services.PersonServices;
import br.com.leno.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Nota importante: Por padrao nao precisa especificar produces e consumes para JSON e XML
 * o spring ja faz isso. Neste caso é apenas para estudo e conhecimento que é possivel especificar
 * No geral é fortemente aconselhado deixar que o Spring lide com isso.*
 * */

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @GetMapping(value = "/{id}",
             produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,MediaType.APPLICATION_YML})
    public PersonVO findById(@PathVariable(value = "id") Long id) throws Exception {
        return service.findByid(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.APPLICATION_YML})
    public List<PersonVO> findAll() {
        return service.findAll();
    }


    @PostMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.APPLICATION_YML},
                consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.APPLICATION_YML})
    public PersonVO create(@RequestBody PersonVO personVO) throws Exception {
        return service.create(personVO);
    }

    @PutMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.APPLICATION_YML},
                 consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.APPLICATION_YML})
    public PersonVO update(@RequestBody PersonVO personVO) throws Exception {
        return service.update(personVO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
