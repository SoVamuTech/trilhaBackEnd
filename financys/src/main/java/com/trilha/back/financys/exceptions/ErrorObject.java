package com.trilha.back.financys.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorObject {
    private int statusCode;
    private long timestamp;
    private String message;
}
