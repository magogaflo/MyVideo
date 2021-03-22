/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 *
 * @author paty
 */
@Component
public class MiServicio implements InterfaceService {

    @Override
    public String operacion() {
        return "ejecutamos algun proceso importante...hola.";

    }

    public String crear() {
        return "vamos a crear";

    }

    @Override
    public String modificar() {
        return  "vamos a modificar";
    }

    @Override
    public String eliminar() {
         return  "vamos a eliminar";
    }

}
