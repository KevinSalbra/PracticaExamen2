/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar;


import com.una.rentacar.Camion.CamionAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin Salazar
 */
public class VehiculoContainer extends CamionAdapter{
    private static Map<String, Vehiculo> cVehiculo = new HashMap<>();
    
    
    
    public static boolean exist(String id)
    {
        return cVehiculo.containsKey(id);
    }
    
    public static boolean agregarVehiculo(Vehiculo c){
       if(!exist(c.getId())){
            cVehiculo.put(c.getId(), c);
            return true;
        }
        return false;
    }

    public static Vehiculo buscarVehiculo(String id) {
        if (exist(id)) {

            return cVehiculo.get(id);
        }
        return null;
    }
}
