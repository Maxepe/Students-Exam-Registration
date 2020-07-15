package model;

import java.util.ArrayList;

public class Examen {
    private int legajo;
    private String apellido;
    private int tipoEvaluacion;
    private double nota;

    public Examen(int legajo, String apellido, int tipoEvaluacion, double nota) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.tipoEvaluacion = tipoEvaluacion;
        this.nota = nota;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(int tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Examen{" + "legajo=" + legajo + ", apellido=" + apellido + ", tipoEvaluacion=" + tipoEvaluacion + ", nota=" + nota + '}';
    }
}
