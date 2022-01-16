package com.trilha.back.financys.dto;

import com.trilha.back.financys.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryDto {

    @NotBlank(message = "O Valor do nome não pode ser nulo ou Vazio")
    @Size(min = 3, max = 45, message = "{tamanho.message}")
    private String name;

    @NotBlank(message = "O Valor do descrição não pode ser nulo ou Vazio")
    @Size(min = 15, max = 150, message = "{tamanho.message}")
    private String description;

    @NotBlank(message = "O Valor do valor não pode ser nulo ou Vazio")
    private BigDecimal amount;

    @NotBlank(message = "O Valor do data não pode ser nulo ou Vazio")
    private LocalDate date;

    @NotBlank(message = "O Valor do pagamento não pode ser nulo ou Vazio")
    private boolean paid;

    private Category categoryId;
}
