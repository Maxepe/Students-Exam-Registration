package model;

import java.util.ArrayList;

public class Escuela {
    private ArrayList<Alumno> alumnos;

    public Escuela() {
        this.alumnos = new ArrayList<>();
    }
    
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
