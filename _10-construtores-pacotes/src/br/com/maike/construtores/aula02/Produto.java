package br.com.maike.construtores.aula02;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEstoque;

    Produto(){
      this.nome = "Sem nome";
      this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    public Produto(String nome) {
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
