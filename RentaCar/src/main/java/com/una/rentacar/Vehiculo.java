/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.una.rentacar;

/**
 *
 * @author Kevin Salazar
 */
public class Vehiculo {

    private String id;
    private String numLlantas;
    private String marca;
    private String cantPasajeros;
    private Integer peso;

    public Vehiculo() {
    }

    public Vehiculo(String[] data) {
        this.id = data[0];
        this.numLlantas = data[1];
        this.marca = data[2];
        this.cantPasajeros = data[3];
        this.peso = Integer.valueOf(data[4]);
    }

    public String getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(String numLlantas) {
        this.numLlantas = numLlantas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(String cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", numLlantas=" + numLlantas + ", marca=" + marca + ", cantPasajeros=" + cantPasajeros + ", peso=" + peso + '}';
    }
    
    

}
