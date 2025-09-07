package com.example.gestaoErro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.gestaoErro.util.DivisaoException;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensagem", "Olá do Thymeleaf!");
        return "index";
    }

    @GetMapping("/dividir/{a}/{b}")
    public String dividir(@PathVariable Long a, @PathVariable Long b, Model model) {
        try {
            Long resultado = a / b;
            model.addAttribute("resultado", resultado);
            return "dividir";
        } catch (ArithmeticException e) {
            throw new DivisaoException("Falha na divisao");
        }
       
    }

}
