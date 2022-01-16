package com.trilha.back.financys.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdivice {

    @ExceptionHandler
    public ResponseEntity<ErrorObject> handlerException(CalculaException ex){
        return ResponseEntity.badRequest()
                .body(new ErrorObject(HttpStatus.BAD_REQUEST.value(),
                        System.currentTimeMillis()
                        ,ex.getMessage()));
    }
}
