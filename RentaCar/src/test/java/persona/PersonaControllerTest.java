/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package persona;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class PersonaControllerTest {
    

    @Test
    public void testAgregarMoto() {
        System.out.println("agregarMoto");
        String[] data = {"12","Luis","Tico","1390"};
         String[] moto = {"1231", "3", "Sabra", "3","300", "250"};
        PersonaController instance = new PersonaController();
        String expResult = "Persona agregada correctamente.";
        String result = instance.agregarPersona(data,moto);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of buscar method, of class PersonaController.
     */
    @Test
    public void testBuscar() {
        
        System.out.println("agregarMoto");
        String[] data = {"12","Luis","Tico","1390"};
         String[] moto = {"1231", "3", "Sabra", "3","300","250"};
        PersonaController instance = new PersonaController();
        String result1 = instance.agregarPersona(data,moto);
       
        
        
        
        System.out.println("buscar");
        String id = "1390";
        String expResult = "Persona encontrada";
        String result = instance.buscar(id);
        
        assertEquals(expResult, result);
        
    }
    
}
