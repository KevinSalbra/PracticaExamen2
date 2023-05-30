/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Motocicleta;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin Salazar
 */
public class MotocicletaContainer {
    
     private static Map<String, Motocicleta> cMotocicleta = new HashMap<String, Motocicleta>();
    
    public static boolean exist(String id)
    {
        return cMotocicleta.containsKey(id);
    }
    
    public static boolean agregarMoto(Motocicleta c) {
        if (!cMotocicleta.containsKey(c.getId())) {
            cMotocicleta.put(c.getId(), c);
            return true;
        }
        return false;
    }

    public static Motocicleta buscarMoto(String id) {
        if (exist(id)) {
            return cMotocicleta.get(id);
        }
        return null;
    }
}
