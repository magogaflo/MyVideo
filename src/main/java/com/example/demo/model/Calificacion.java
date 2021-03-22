/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author paty
 */
@Entity
public class Calificacion {
    
    @Id
    @NotNull
    private String id;
    private String nombre_calificacion;

    public Calificacion(String id, String nombre_calificacion) {
        this.id = id;
        this.nombre_calificacion = nombre_calificacion;
    }

    public Calificacion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCalificacion() {
        return nombre_calificacion;
    }

    public void setNombreCalificacion(String nombreCalificacion) {
        this.nombre_calificacion = nombreCalificacion;
    }

    

   
   

   
    
    
    
    
}
