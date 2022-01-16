package com.trilha.back.financys.dto;

import com.trilha.back.financys.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryDto {

    @NotBlank(message = "O Valor do nome não pode ser nulo ou Vazio")
    @Size(min = 3, max = 45, message = "Tamanho da menssagem não esta correto")
    private String name;

    @NotBlank(message = "O Valor do descrição não pode ser nulo ou Vazio")
    @Size(min = 15, max = 150, message = "Tamanho da menssagem não esta correto")
    private String description;

    @NotNull(message = "O Valor do quantidade não pode ser nulo ou Vazio" )
    @Min(value = 0, message = "O valor nao pode ser menor que 0")
    private BigDecimal amount;

    private LocalDate date;

    @NotNull(message = "O Valor se esta pago ou pendente não pode ser nulo ou Vazio" )
    private boolean paid;

    private Category categoryId;
}
