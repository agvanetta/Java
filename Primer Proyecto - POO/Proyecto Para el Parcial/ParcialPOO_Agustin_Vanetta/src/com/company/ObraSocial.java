package com.company;

public class ObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private int numeroAsociado;


    @Override
    public int compareTo(Object obj) {
        ObraSocial obrasocial1 = (ObraSocial) obj;
        int resultado = 0;
        if (numeroAsociado > obrasocial1.numeroAsociado){
            resultado = 1;
        }
        if(numeroAsociado < obrasocial1.numeroAsociado){
            resultado = -1;
        }
        return resultado;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public int getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(int numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }
}
