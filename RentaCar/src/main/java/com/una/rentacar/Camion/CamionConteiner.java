/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Camion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class CamionConteiner {
    
    private static Map<String, Camion> cCamion = new HashMap<String, Camion>();
    
    public static boolean exist(String id)
    {
        return cCamion.containsKey(id);
    }
    
    public static boolean agregarCamion(Camion c) {
        if (!cCamion.containsKey(c.getId())) {
            cCamion.put(c.getId(), c);
            return true;
        }
        return false;
    }

    public static Camion buscarCamion(String id) {
        if (exist(id)) {

            return cCamion.get(id);
            
        }
        return null;
    }
    
        public static boolean eliminarCamion(String id) {
        if (exist(id)) {
            cCamion.remove(id);
            return true;
        }
        return false;
    }
}
