package com.example.primeiro_projeto_spring.service;

import com.example.primeiro_projeto_spring.repository.MensagemRepository;
import org.springframework.stereotype.Service;

@Service // indica que a classe contem as regras de negocio da aplicação
public class MensagemService {

    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public String ObterMensagem() {
        return mensagemRepository.obterMensagem();
    }
}
