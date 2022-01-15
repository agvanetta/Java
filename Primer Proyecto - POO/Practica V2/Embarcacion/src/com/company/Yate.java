package com.company;

public class Yate extends Embarcacion implements Comparable{
    private int cantidadDeCamarotes;

        @Override
    public int compareTo(Object obj) {
        Yate yate2 = (Yate) obj;
        int respuesta=0;
        if(cantidadDeCamarotes > yate2.cantidadDeCamarotes){
            respuesta=1;
        } if (cantidadDeCamarotes < yate2.cantidadDeCamarotes) {
            respuesta=-1;
            }
        return respuesta;
    }
}
