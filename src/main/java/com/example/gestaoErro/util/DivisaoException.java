package com.example.gestaoErro.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED,reason ="Divisao com zero nao pode...")
public class DivisaoException extends RuntimeException {
    
    public DivisaoException(String mensagem) {
        super(mensagem);
    }
}
