package com.trilha.back.financys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    @NotBlank(message = "O Valor do nome não pode ser nulo ou Vazio")
    @Size(min = 3, max = 15, message = "{tamanho.message}")
    private String name;

    @NotBlank(message = "O Valor da descrição não pode ser nulo ou Vazio")
    @Size(min = 15, max = 50, message = "{tamanho.message}")
    private String description;

    @NotBlank(message = "O Valor do type não pode ser nulo ou Vazio")
    @Size(min = 3, max = 10, message = "{tamanho.message}")
    private String type;

}
