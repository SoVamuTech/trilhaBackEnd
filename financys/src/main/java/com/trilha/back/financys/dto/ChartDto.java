package com.trilha.back.financys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChartDto {

    private String name;
    private String type;
    private BigDecimal total;

}
