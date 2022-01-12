package com.trilha.back.financys.dto;

import com.trilha.back.financys.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryDto {

    private String name;
    private String description;
    private String type;
    private String amount;
    private LocalDate date;
    private boolean paid;

    private Category categoryId;
}
