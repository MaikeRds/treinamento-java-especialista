package br.com.maike.construtores.aula02;

public class Main {

    // 10.02. Construtores com parâmetros
    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha 1k (peça)");

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);
    }
}
