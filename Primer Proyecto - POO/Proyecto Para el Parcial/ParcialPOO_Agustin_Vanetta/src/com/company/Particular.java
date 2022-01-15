package com.company;

public class Particular extends Paciente{
    private double montoDeConsulta;
    private int dni;

    public double getMontoDeConsulta() {
        return montoDeConsulta;
    }

    public void setMontoDeConsulta(double montoDeConsulta) {
        this.montoDeConsulta = montoDeConsulta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
