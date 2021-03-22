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
public class Genero  {

    @Id
    @NotNull
    private String id;
    private String nombre_genero;

    public Genero(String id, String nombre_genero) {
        this.id = id;
        this.nombre_genero = nombre_genero;
    }

    public Genero() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

    
    
   
   

   


}
