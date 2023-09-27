package br.com.gabriel.apirestspring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CustomerDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String city;

    public String getfullName(){
        return this.firstName + "" + this.lastName;
    }
}
