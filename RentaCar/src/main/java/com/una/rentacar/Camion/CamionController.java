/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Camion;

/**
 *
 * @author Admin
 */
public class CamionController implements CamionInterface{
    
     public String agregarCamion (String[] data)
    {
        String response = "Camion ingresado previamente.";
        if (CamionConteiner.exist(data[0])) {
           Camion camion = new Camion(data);
            if (CamionConteiner.agregarCamion(camion)) {
                response = "Camion agregado correctamente.";
            }
            else response = "Error al agregar los datos";
        }
        return response;
    }
    
   
     public String[] buscar(String id) {
         
        if (CamionConteiner.exist(id)) {
          Camion camion = CamionConteiner.buscarCamion(id);
          String CapCombustible = String.valueOf(camion.getCapacidadDeCombustible()) ; 
          String[] data = {camion.getMarca(), camion.getCantPasajeros(), camion.getNumLlantas(), 
              camion.getNacionalidad(), CapCombustible};
            return data;
        }
        return null;
    }
}
