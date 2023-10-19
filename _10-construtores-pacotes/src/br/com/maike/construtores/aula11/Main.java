package br.com.maike.construtores.aula11;

import br.com.maike.construtores.aula11.comercial.Pedido;
import br.com.maike.construtores.aula11.estoque.Produto;

public class Main {

    // 10.11. Modificador de acesso public e default
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Produto produto = new Produto();

        System.out.println("Olá");
    }
}
