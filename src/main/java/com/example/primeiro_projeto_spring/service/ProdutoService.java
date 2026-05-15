package com.example.primeiro_projeto_spring.service;

import com.example.primeiro_projeto_spring.exceptions.RecursoNaoEncontradoException;
import com.example.primeiro_projeto_spring.model.Produto;
import com.example.primeiro_projeto_spring.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;


    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll(); // esse metodo ja existe dentro do jpa
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(
                        () -> new RecursoNaoEncontradoException("Produto com Id:" + id + " não encontrado")
                );
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        if (!produtoRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("produto com ID " + id + " não encontrado");
        }
    }

}
