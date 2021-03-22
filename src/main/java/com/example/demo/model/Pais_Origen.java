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
public class Pais_Origen {
    
    @Id
    @NotNull
    private String id;
    private String idioma;
    private String nombre_pais;

    public Pais_Origen(String id, String idioma, String nombre_pais) {
        this.id = id;
        this.idioma = idioma;
        this.nombre_pais = nombre_pais;
    }  

    public Pais_Origen() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    

    

   
    
    
}
