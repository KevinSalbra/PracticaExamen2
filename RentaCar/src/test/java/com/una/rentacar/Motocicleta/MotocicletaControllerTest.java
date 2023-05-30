/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.una.rentacar.Motocicleta;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MotocicletaControllerTest {

    public MotocicletaControllerTest() {
    }

    /**
     * Test of agregarMoto method, of class MotocicletaController.
     */
    @org.junit.jupiter.api.Test
    public void testAgregarMoto() {

        System.out.println("agregarMoto");
        MotocicletaController instance = new MotocicletaController();
        String[] data = {"L1231", "3", "Sabra", "3","300", "250"};
         String result = instance.agregarMoto(data);
        String expResult = "Motocicleta agregada correctamente.";
        assertEquals(expResult, result);
    }

    /**
     * Test of buscar method, of class MotocicletaController.
     */
    @org.junit.jupiter.api.Test
    public void testBuscar() {
          System.out.println("agregarMoto");
        MotocicletaController instance = new MotocicletaController();
        String[] data = {"L1231", "3", "Sabra", "3","300", "250"};
         String result1 = instance.agregarMoto(data);
        
        Motocicleta moto = new Motocicleta();
        
        System.out.println("buscar");
        String expResult = "Moto encontrada";
        String id ="L1231";
        String result = instance.buscar(id);
        
        assertEquals(expResult, result);
        
    }

}
