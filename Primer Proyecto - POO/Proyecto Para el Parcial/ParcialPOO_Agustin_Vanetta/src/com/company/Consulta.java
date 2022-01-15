package com.company;
import java.util.Date;

public class Consulta {
    private Date fechaDeConsulta;
    private String especialidad;
    private Date horaYMinConsulta;

    public Consulta(Date fechaDeConsulta, String especialidad, Date horaConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
        this.especialidad = especialidad;
        this.horaYMinConsulta = horaConsulta;
    }

    public Date getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public void setFechaDeConsulta(Date fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getHoraConsulta() {
        return horaYMinConsulta;
    }

    public void setHoraConsulta(Date horaConsulta) {
        this.horaYMinConsulta = horaConsulta;
    }
}
