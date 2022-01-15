package com.company;

public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;
    private Capitan capitan;

    public void montoDeAlquiler () {
        double monto;
        if (anioFabricacion>2020){
            monto = precioBase + valorAdicional;
        } else {
            monto = precioBase;
        }
        System.out.println( " El monto del alquiler es "+ monto);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
}
