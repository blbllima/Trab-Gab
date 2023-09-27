package br.com.gabriel.apirestspring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class VehicleDTO {
    private int id;
    private String modelName;
    private String assembler;
    private int manufactureYear;
    private int modelYear;
}
