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
public class Departamento {
    private int id;
    private String nombre;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Departamento> buscarDepartamento(){
        return null;
    }
    
    public Departamento eliminar(){
        return null;
    }
    
    public Departamento modificar(String nombre){
        this.setNombre(nombre);
        return this;
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
}