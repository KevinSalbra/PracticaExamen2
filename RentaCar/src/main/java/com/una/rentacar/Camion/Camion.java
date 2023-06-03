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
  
    public Camion() {
    }

    public Camion(String[] data) {
        super(data);
        this.setId(data[0]);
        this.setNumLlantas(data[1]);
        this.setMarca(data[2]);
        this.setCantPasajeros(data[3]);
        this.setPeso(Integer.valueOf(data[4]));
        
        
        
        this.Nacionalidad = data[5];
        this.capacidadDeCombustible = Integer.valueOf(data[6]);
        
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
    
     public String toString() {
        return "\n"
                + "==========================================" + "\n"
                + "== Camion ==" + "\n"
                + "Id: " + this.getId() + "\n"
                + "Marca: " + this.getMarca()+ "\n"
                + "Nacionalidad: " + this.getNacionalidad()+ "\n"
                + "Capacidad de combustible: " + this.getCapacidadDeCombustible()+ "\n"
                + "Cantidad de pasajeros: " + this.getCantPasajeros()+ "\n"
                + "Numero de llantas: " + this.getNumLlantas()+ "\n"
                + "Peso: " + this.getPeso()+ "\n"
               
                + "==========================================";
    }
    
}
