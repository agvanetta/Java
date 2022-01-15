package com.company;

public abstract class Proyecto {
    private Integer numeroProyecto;
    private String nombreProyecto;
    private String ciudad;
    private String status;
    private Construccion construccion;


    public Proyecto(Integer numeroProyecto, String nombreProyecto, String ciudad, String status, Construccion construccion) {
        this.numeroProyecto = numeroProyecto;
        this.nombreProyecto = nombreProyecto;
        this.ciudad = ciudad;
        this.status = status;
        this.construccion = construccion;
    }

    public Boolean finalizaEnFecha(){
             if(construccion.getFechaFinPrevista().equals(construccion.getFechaFinReal())  && status == "FINALIZADO" ){
                  return true;
             }
             return false;
    }

}
