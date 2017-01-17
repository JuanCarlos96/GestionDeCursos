/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Juan Carlos
 */
public class Impartición {
    
    private int id;
    private Empleado empleado;
    private Curso curso;
    private Date fecha;

    public Impartición(Empleado empleado, Curso curso, Date fecha) {
        this.empleado = empleado;
        this.curso = curso;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}