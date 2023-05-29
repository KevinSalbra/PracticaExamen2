/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Camion;

import com.una.rentacar.Vehiculo;

/**
 *
 * @author Admin
 */
public class Camion extends Vehiculo{

    private Integer capacidadDeCombustible;
    private String Nacionalidad;
    private boolean articulado;
    public Camion() {
    }

    public Camion(String[] data) {
        super(data);
        this.Nacionalidad = data[0];
        this.capacidadDeCombustible = Integer.valueOf(data[1]);
        this.articulado = Boolean.valueOf(data[2]);
    }
    
    // set y get de la clase

    public Integer getCapacidadDeCombustible() {
        return capacidadDeCombustible;
    }

    public void setCapacidadDeCombustible(Integer capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    
    
}
