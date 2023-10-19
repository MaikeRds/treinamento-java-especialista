package br.com.maike.construtores.aula15;

import static br.com.maike.construtores.aula15.CalculadoraArea.PI;
import static br.com.maike.construtores.aula15.CalculadoraArea.calcularAreaCirculo;
import static br.com.maike.construtores.aula15.CalculadoraArea.calcularAreaQuadrado;

public class Main {

    // 10.15. Importando membros estáticos - static import
    public static void main(String[] args) {

        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo = calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n", PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }
}
