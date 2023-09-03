package org.strategy;

public class ICMS implements Imposto{

    final Double icms = 0.8;

    @Override
    public Double valorImposto(Double valor) {
        return valor * icms;
    }
}
