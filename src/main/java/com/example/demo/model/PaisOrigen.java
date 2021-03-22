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
public class PaisOrigen {
    
    @Id
    private String idioma;
    private String nombrePais;

    public PaisOrigen(String idioma, String nombrePais) {
        this.idioma = idioma;
        this.nombrePais = nombrePais;
    }

   

    public PaisOrigen() {
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

   
    
    
}
