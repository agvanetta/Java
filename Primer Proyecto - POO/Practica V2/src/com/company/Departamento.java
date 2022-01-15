package com.company;

public class Departamento extends Proyecto implements Comparable {
    private int cantDePisos;
    private int dptosPorPiso;


    @Override
    public int compareTo(Object obj) {
        Departamento depto1 = (Departamento) obj;
        int resultado = 0;
        if (cantDePisos > depto1.cantDePisos){
            resultado = 1;
        } if (cantDePisos < depto1.cantDePisos){
            resultado =-1;
        }
        return resultado;
    }

    public boolean esRascacielos(){
        return cantDePisos>15;
    }
}
