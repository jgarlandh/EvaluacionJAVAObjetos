package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

public class Asignatura {
    public String nombreAsignatura;
    public String nombreMaestro;
    
    public Asignatura() {
    }

    public Asignatura(String nombreAsignatura, String nombreMaestro) {
        this.nombreAsignatura = nombreAsignatura;
        this.nombreMaestro = nombreMaestro;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    @Override
    public String toString() {
        return "Asignatura [nombreAsignatura=" + nombreAsignatura + ", nombreMaestro=" + nombreMaestro + "]";
    }

    
}
