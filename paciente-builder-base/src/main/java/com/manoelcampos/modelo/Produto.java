package com.manoelcampos.modelo;

import lombok.Getter;

import java.time.LocalDate;

public class Produto {
    private long id;
    @Getter
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    Produto(Builder builder) {
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.descricao = builder.descricao;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.estoque = builder.estoque;
        this.preco = builder.preco;
        this.dataCadastro = builder.dataCadastro;
        this.dataUltimaAtualizacao = builder.dataUltimaAtualizacao;
        this.urlFoto = builder.urlFoto;
        this.categoria = builder.categoria;
        this.peso = builder.peso;
        this.altura = builder.altura;
        this.largura = builder.largura;
        this.profundidade = builder.profundidade;

    }

}