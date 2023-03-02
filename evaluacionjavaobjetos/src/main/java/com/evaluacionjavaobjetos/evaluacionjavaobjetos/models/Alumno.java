package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Alumno extends Persona{
    
    ArrayList<Double> notas = new ArrayList<Double>();

    public Alumno() {
        super();
    }

    public Alumno(String nombre, ArrayList<Double> notas) {
        super(nombre);
        this.notas = notas;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [notas=" + notas + "]";
    }
}
