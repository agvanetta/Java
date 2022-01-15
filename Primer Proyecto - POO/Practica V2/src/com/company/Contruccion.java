package com.company;

import java.util.Date;

public class Contruccion {
    private String direccion;
    private Date fechaInicio;
    private Date fechaFinPrevista;
    private Date fechaFinReal;



    public Contruccion(String direccion, Date fechaInicio, Date fechaFinPrevista, Date fechaFinReal) {
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFinPrevista = fechaFinPrevista;
        this.fechaFinReal = fechaFinReal;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinPrevista() {
        return fechaFinPrevista;
    }

    public void setFechaFinPrevista(Date fechaFinPrevista) {
        this.fechaFinPrevista = fechaFinPrevista;
    }

    public Date getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(Date fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }
}

