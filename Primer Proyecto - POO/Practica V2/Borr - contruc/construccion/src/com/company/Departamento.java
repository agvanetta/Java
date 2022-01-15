package com.company;

public class Departamento extends Proyecto implements Comparable {
    private Integer cantidadDePisos;
    private Integer pisosPorDepartamento;

    public Departamento(Integer numeroProyecto, String nombreProyecto, String ciudad, String status, Construccion construccion, Integer cantidadDePisos, Integer pisosPorDepartamento) {
        super(numeroProyecto, nombreProyecto, ciudad, status, construccion);
        this.cantidadDePisos = cantidadDePisos;
        this.pisosPorDepartamento = pisosPorDepartamento;
    }

    @Override
    public int compareTo(Object o) {
        Departamento departamento = (Departamento) o;
        if (cantidadDePisos > departamento.cantidadDePisos) {
            return 1; //Mayor
        }
        if (cantidadDePisos< departamento.cantidadDePisos) {

            return -1; //Menor
        }return 0; //Son iguales
    }

    public Boolean esRascacielos(){
        if(cantidadDePisos > 15){
            return true;
        }else{
            return false;
        }
    }

}
