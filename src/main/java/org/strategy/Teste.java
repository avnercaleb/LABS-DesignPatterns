package org.strategy;

public class Teste {
    public static void main(String[] args) {

        Double compra = 10D;
        System.out.println("Valor do imposto -> R$" + Governo.calcularImposto(new ICMS(), compra));
    }
}
