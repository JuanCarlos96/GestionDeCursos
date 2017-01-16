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
public class Empleado {
    
    private int id;
    private String nombre;
    private String apellidos;
    private Departamento departamento;
    private float salario;

    public Empleado(String nombre, String apellidos, Departamento departamento, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    public ArrayList<Empleado> obtenerEmpleado(){
        return null;
    }
    
    public Empleado eliminar(){
        return null;
    }
    
    public Empleado modificar(String nombre, String apellidos, Departamento departamento, float salario){
        return null;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}