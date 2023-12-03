package br.com.leno.data.vo.v1.person;

import br.com.leno.model.Person;

public record PersonDTO(Long id, String firstName, String lastName, String address, String gender) {

    public PersonDTO(Person person) {
        this(person.getId(), person.getFirstName(), person.getLastName(), person.getAddress(), person.getGender());
    }


}
