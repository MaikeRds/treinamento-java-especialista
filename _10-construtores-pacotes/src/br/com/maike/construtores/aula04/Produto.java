package br.com.maike.construtores.aula04;

import java.util.Objects;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEstoque;

    Produto(){
      this.nome = "Sem nome";
      this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    public Produto(String nome) {
        Objects.requireNonNull(nome, "nome é obrigatório");

        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    public Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "nome é obrigatório");

        if (estoqueInicial < 0){
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo.");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
    }
}
