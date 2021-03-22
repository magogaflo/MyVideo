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
public class Pelicula {

    @Id
    private String nombre;
    private String descripcion;
    private String imagen = "logo.png";
    private  String tituloOriginal;
    private int duracion;

    public Pelicula(String nombre, String descripcion, String tituloOriginal, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tituloOriginal = tituloOriginal;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    

   
}
