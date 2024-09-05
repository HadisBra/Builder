package com.manoelcampos.main;

import com.manoelcampos.modelo.Produto;
import com.manoelcampos.modelo.Builder;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Builder("Produto 1", 100.0, LocalDate.now(), LocalDate.now(), "Categoria 1")
                .id(1)
                .descricao("Descrição do Produto 1")
                .marcaModelo("Marca 1", "Modelo 1")
                .estoque(10)
                .urlFoto("http://example.com/produto1.jpg")
                .peso(1.0)
                .altura(2.0)
                .largura(3.0)
                .profundidade(4.0)
                .build();

        System.out.println("Produto criado: " + produto.getTitulo());
    }
}