/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gerdoc.dao;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Marca implements Serializable{
    
    private Integer id_CatMarca;
    private String marca;

    public Marca() {
    }

    public Integer getId_CatMarca() {
        return id_CatMarca;
    }

    public void setId_CatMarca(Integer id_CatMarca) {
        this.id_CatMarca = id_CatMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
