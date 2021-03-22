/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author paty
 */
@Entity
public class Calificacion {
    @Id
    private String nombreCalificacion;

    public Calificacion(String nombreCalificacion) {
        this.nombreCalificacion = nombreCalificacion;
    }

    
    public Calificacion() {
    }

    public String getNombreCalificacion() {
        return nombreCalificacion;
    }

    public void setNombreCalificacion(String nombreCalificacion) {
        this.nombreCalificacion = nombreCalificacion;
    }

   
   

   
    
    
    
    
}
