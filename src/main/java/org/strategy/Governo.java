package org.strategy;

public class Governo {

    static Double calcularImposto(Imposto imposto, Double valor){
        return imposto.valorImposto(valor);
    }
}
