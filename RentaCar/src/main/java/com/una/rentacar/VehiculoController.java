/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar;



/**
 *
 * @author Kevin Salazar
 */
public class VehiculoController implements VehiculoInterface{
    
    @Override
     public String agregar (String[] data)
    {
       String response = "Motocicleta ingresada previamente.";
          Vehiculo vehiculo = new Vehiculo(data);
        if (!VehiculoContainer.exist(vehiculo.getId())) {
            if (VehiculoContainer.agregarVehiculo(vehiculo)) {
                response = "Motocicleta agregada correctamente.";
            }
            else response = "Error al agregar los datos";
        }
        return response;
    }
    
    @Override
        public String[] buscar(String id) {
        if (VehiculoContainer.exist(id)) {
           Vehiculo vehiculo = VehiculoContainer.buscarVehiculo(id);
            String[] data = {vehiculo.getMarca(), vehiculo.getCantPasajeros(), vehiculo.getNumLlantas()};
            return data;
        }
        return null;
    }
}
