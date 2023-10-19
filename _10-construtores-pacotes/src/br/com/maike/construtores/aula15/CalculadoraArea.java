package br.com.maike.construtores.aula15;

public class CalculadoraArea {

    public static final double PI = 3.141592653;

    public static double calcularAreaQuadrado(double medidaDoLado){
        return  medidaDoLado * medidaDoLado;
    }

    public static double calcularAreaCirculo(double raio){
        return raio * raio * CalculadoraArea.PI;
    }
}
