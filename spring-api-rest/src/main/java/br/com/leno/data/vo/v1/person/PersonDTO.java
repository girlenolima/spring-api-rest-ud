package br.com.leno.data.vo.v1.person;

import br.com.leno.model.Person;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

/** JsonPropertyOrder e @JsonProperty esse anotaçao serve apenas para modificar o JSON que exibido no navegador
 *  Nao altera a funcionalidade do metodo.
 *  Pode ser que algum campo nao tenha um nome nao amigavel, por isso, e caso queira
 *  É possivel apenas modicar a exibiçao do JSON.
 *  É possivel aletar nome do campo no arquivo JSON e a Ordem de exibiçao.
**/
@JsonPropertyOrder({"idU","gender","firstName"})
public record PersonDTO( Long id,
                         @JsonProperty("Nome")
                         String firstName,
                         @JsonProperty("Sobrenome")
                         String lastName,
                         @JsonProperty("Endereço")
                         String address,
                         @JsonProperty("Sexo")
                         String gender)  implements Serializable  {

    private static final long serialVErsionUID = 1L;

    public PersonDTO(Person person) {
        this(person.getIdU(), person.getFirstName(), person.getLastName(), person.getAddress(), person.getGender());
    }


}
