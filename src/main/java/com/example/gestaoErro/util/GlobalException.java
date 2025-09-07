package com.example.gestaoErro.util;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(IllegalArgumentException.class)    
    public String handlellegalArgumentException(IllegalArgumentException ex, Model model) {
        
        model.addAttribute("status", HttpStatus.NOT_FOUND.value());
        model.addAttribute("error", "Recurso Não Encontrado");
        model.addAttribute("message", ex.getMessage());
        
        return "error/custom-error";
    }

    
}


