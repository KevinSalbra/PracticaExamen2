/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class PersonaContainer {
    private static Map<String,Persona> cPersona =  new HashMap<>();
    
    public static boolean exist(String id)
    {
        return cPersona.containsKey(id);
    }
    
    public static boolean agregarMoto(Persona c) {
        if (!cPersona.containsKey(c.getIdentificacion())) {
            cPersona.put(c.getIdentificacion(), c);
            return true;
        }
        return false;
    }

    public static Persona buscarPersona(String id) {
        if (exist(id)) {
            return cPersona.get(id);
        }
        return null;
    }
    
    
}
