package com.company;
import java.util.Date;


public abstract class Paciente {
    private Date fechaDeNacimiento;
    private String nombre;
    private String apellido;
    private boolean esPrimeraConsulta;
    private Consulta consulta;

    public boolean necesitaEvaluacionInicial(){
        return esPrimeraConsulta;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEsPrimeraConsulta() {
        return esPrimeraConsulta;
    }

    public void setEsPrimeraConsulta(boolean esPrimeraConsulta) {
        this.esPrimeraConsulta = esPrimeraConsulta;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
