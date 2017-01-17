/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos
 */
public class Curso {
    
    private int id;
    private String nombre;
    private Departamento departamento;

    public Curso(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }
    
    public ArrayList<Curso> obtenerCurso(){
        return null;
    }
    
    public void modificarCurso(String nombre, Departamento departamento){
    
    }
    
    public void eliminarCurso(){
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }    
}