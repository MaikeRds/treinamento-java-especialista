package br.com.maike.construtores.aula12;


import br.com.maike.construtores.aula12.comercial.Pedido;
import br.com.maike.construtores.aula12.estoque.Produto;

public class Main {

    // 10.12. Modificador de acesso private
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Produto produto = new Produto();

        System.out.println("Olá");
    }
}
