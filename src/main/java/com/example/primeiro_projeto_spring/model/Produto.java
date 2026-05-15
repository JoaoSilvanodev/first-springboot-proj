package com.example.primeiro_projeto_spring.model;

import jakarta.persistence.*;

@Entity // Indica que a classe é uma entidade JPA
@Table(name = "produtos") // Indica e define o nome da tabela "Produtos" no banco
public class Produto {

    @Id // Indica que a variável é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que a variavel é uma chave primaria que será gerada automaticamente
    private Long id;

    private String nome;
    private String preco;


    public Produto() {}

    public Produto(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
