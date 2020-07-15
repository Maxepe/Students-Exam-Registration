package model;

import java.util.ArrayList;

public class Alumno {
    private ArrayList<Examen> examenes;
    
    public Alumno() {
        this.examenes = new ArrayList<>();
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }
    
    public void addExamen(Examen e){
        examenes.add(e);
    }
    
    public double promGeneral(){
        double acum = 0;
        double cont = 0;
        for (Examen examen : examenes) {
            acum += examen.getNota();
            cont++;
        }
        return acum/cont;
    }
    
    public int alumnos7ExamenOral(){
        int cont = 0;
        for (Examen examen : examenes) {
            if (examen.getTipoEvaluacion() == 1 && examen.getNota()> 7) {
                cont++;
            }
        }
        return cont;
    } 
}
