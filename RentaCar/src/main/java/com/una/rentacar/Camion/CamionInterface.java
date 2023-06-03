/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.rentacar.Camion;

/**
 *
 * @author Kevin Salazar
 */
public interface CamionInterface {

    public String agregarCamion(String[] data);

    public String[] buscar(String id);

    public Camion buscarCamion(String id);

    public String eliminar(String id);
}
