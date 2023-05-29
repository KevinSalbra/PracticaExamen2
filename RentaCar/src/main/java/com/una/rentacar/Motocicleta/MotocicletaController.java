/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Motocicleta;

/**
 *
 * @author Kevin Salazar
 */
public class MotocicletaController implements MotocicletaInterface{
    
    @Override
    public String agregarMoto (String[] data)
    {
        String response = "Motocicleta ingresada previamente.";
        if (MotocicletaContainer.exist(data[0])) {
            Motocicleta moto = new Motocicleta(data);
            if (MotocicletaContainer.agregarMoto(moto)) {
                response = "Motocicleta agregada correctamente.";
            }
            else response = "Error al agregar los datos";
        }
        return response;
    }
    
    @Override
     public String[] buscar(String id) {
        if (MotocicletaContainer.exist(id)) {
           Motocicleta motocicleta = MotocicletaContainer.buscarMoto(id);
            String[] data = {motocicleta.getMarca(), motocicleta.getCantPasajeros(), motocicleta.getNumLlantas(), motocicleta.getCantCc()};
            return data;
        }
        return null;
    }

}
