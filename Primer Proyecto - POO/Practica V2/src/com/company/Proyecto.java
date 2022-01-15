package com.company;

public abstract class Proyecto {
    private int numeroDeIdentificacion;
    private String nombreProyecto;
    private String ciudadProyecto;
    private String estado;
    private Contruccion contruccion;

    public boolean finalizoEnFecha(){
        if(contruccion.getFechaFinPrevista().equals(contruccion.getFechaFinReal()) && estado == "FINALIZADO" ){
            return true;
        }
        return false;

    }
}
