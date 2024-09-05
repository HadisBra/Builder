package com.manoelcampos.modelo;

import java.time.LocalDate;

public class Builder {
    long id;
    String titulo;
    String descricao;
    String marca;
    String modelo;
    int estoque;
    double preco;
    LocalDate dataCadastro;
    LocalDate dataUltimaAtualizacao;
    String urlFoto;
    String categoria;
    double peso;
    double altura;
    double largura;
    double profundidade;

    public Builder(String titulo, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String categoria) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }
        if (dataCadastro.isBefore(LocalDate.now()) || dataUltimaAtualizacao.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("As datas de cadastro e última atualização não podem ser anteriores à data atual");
        }
        this.titulo = titulo;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.categoria = categoria;
    }

    public Builder id(long id) {
        this.id = id;
        return this;
    }

    public Builder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Builder marcaModelo(String marca, String modelo) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Marca é obrigatória para definir o modelo");
        }
        this.marca = marca;
        this.modelo = modelo;
        return this;
    }

    public Builder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public Builder urlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public Builder peso(double peso) {
        this.peso = peso;
        return this;
    }

    public Builder altura(double altura) {
        this.altura = altura;
        return this;
    }

    public Builder largura(double largura) {
        this.largura = largura;
        return this;
    }

    public Builder profundidade(double profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public Produto build() {
        return new Produto(this);
    }
}