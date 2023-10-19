package br.com.maike.construtores.aula09;


import br.com.maike.construtores.aula09.estoque.Produto;

public class Main {

    // 10.09. Organizando as classes em pacotes
    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha 1k (peça)");
        Produto produto2 = new Produto("", 35);
        Produto produto3 = new Produto();

        System.out.println(produto1.codigo);
        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        System.out.println(produto2.codigo);
        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println(produto3.codigo);
        System.out.println(produto3.nome);
        System.out.println(produto3.quantidadeEstoque);
    }
}
