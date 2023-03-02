package com.evaluacionjavaobjetos.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Curso {
    
    ArrayList<Alumno> alumnosCurso = new ArrayList<Alumno>();

    public Curso() {
    }

    public Curso(ArrayList<Alumno> alumnosCurso) {
        this.alumnosCurso = alumnosCurso;
    }

    public ArrayList<Alumno> getAlumnosCurso() {
        return alumnosCurso;
    }

    public void setAlumnosCurso(ArrayList<Alumno> alumnosCurso) {
        this.alumnosCurso = alumnosCurso;
    }

    @Override
    public String toString() {
        return "Curso [alumnosCurso=" + alumnosCurso + "]";
    }

}
