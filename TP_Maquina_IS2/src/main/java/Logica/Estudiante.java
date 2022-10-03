/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author ivanb
 */
public class Estudiante extends Persona {
    private ArrayList<HistoriaAcademica> historiaAcademica = new ArrayList();
    private ArrayList<MesaExamen> inscripciones;

    public Estudiante() {
        //deberia hacer historia.add(historia?manso bardo)
    }

    public Estudiante(ArrayList<HistoriaAcademica> historiaAcademica, ArrayList<MesaExamen> inscripciones,
            String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.historiaAcademica = historiaAcademica;
        this.inscripciones = inscripciones;
    }

    public ArrayList<HistoriaAcademica> getHistoriaAcademica() {
        return historiaAcademica;
    }

    public void setHistoriaAcademica(ArrayList<HistoriaAcademica> historiaAcademica) {
        this.historiaAcademica = historiaAcademica;
    }

    public ArrayList<MesaExamen> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<MesaExamen> inscripciones) {
        this.inscripciones = inscripciones;
    }

}
