package com.example.primeiro_projeto_spring.controller;

import com.example.primeiro_projeto_spring.service.MensagemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MensagemController {

    private final MensagemService mensagemService;


    public MensagemController(MensagemService mensagemService) {
        this.mensagemService = mensagemService;
    }

    @GetMapping("/msg")
    public String mensagem() {
        return mensagemService.ObterMensagem();
    }
}
