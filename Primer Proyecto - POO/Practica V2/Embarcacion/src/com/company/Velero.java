package com.company;

public class Velero extends Embarcacion implements  Evaluable{

    private int cantidadDeMastiles;

    @Override
    public boolean esGrande() {
        return cantidadDeMastiles>4;
    }
}
