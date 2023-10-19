package br.com.maike.construtores.aula05;

public class Main {

    // 10.05. Encadeamento de chamadas de construtores
    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha 1k (peça)");
        Produto produto2 = new Produto(null, -35);
        Produto produto3 = new Produto();

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println(produto3.nome);
        System.out.println(produto3.quantidadeEstoque);
    }
}
