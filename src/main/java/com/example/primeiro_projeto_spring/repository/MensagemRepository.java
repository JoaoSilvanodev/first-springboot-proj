package com.example.primeiro_projeto_spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    public String obterMensagem() {
        return "ola do repository";
    }
}
