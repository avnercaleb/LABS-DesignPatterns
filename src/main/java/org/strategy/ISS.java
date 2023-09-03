package org.strategy;

public class ISS implements Imposto{

    final Double iss = 0.6;

    @Override
    public Double valorImposto(Double valor) {
        return valor * iss;
    }
}
