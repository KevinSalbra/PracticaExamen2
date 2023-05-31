/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Admin
 */
public class PersonaController implements PersonaInterface{
    
     @Override
     public String agregarPersona (String[] data,String[] moto)
    {
        String response = "Persona ingresada previamente.";
        
          Persona persona = new Persona(data,moto);
        if (!PersonaContainer.exist(persona.getIdentificacion())) {
            if (PersonaContainer.agregarMoto(persona)) {
                response = "Persona agregada correctamente.";
            }
            else response = "Error al agregar los datos";
        }
        return response;
    }
    
   
     @Override
     public String buscar(String id) {
        if (PersonaContainer.buscarPersona(id) == null) {
            return "Persona no encontrada";
          
        }else{
            System.out.println(PersonaContainer.buscarPersona(id));
            return "Persona encontrada";
        }
    }
    
}
