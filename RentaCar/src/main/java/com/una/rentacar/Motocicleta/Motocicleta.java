/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Motocicleta;

import com.una.rentacar.Vehiculo;

/**
 *
 * @author Kevin Salazar
 */
public class Motocicleta extends Vehiculo{
    
    private String cantCc;

    public Motocicleta() {
       
    }

    public Motocicleta(String[] data) {
        super(data);
        this.cantCc = data[5];
    }

    public String getCantCc() {
        return cantCc;
    }

    public void setCantCc(String cantCc) {
        this.cantCc = cantCc;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "cantCc: " + cantCc +"\n"+ "Cantidad de Pasajeros: "+this.getCantPasajeros() +"\n"+ "Identificacion del vehiculo: "+this.getId() +"\n"+
                "Marca= "+this.getMarca()+"\n"+"Numero de llantas= "+this.getNumLlantas()+"Peso= "+this.getPeso()+ '}';
    }
    
    
    
}
