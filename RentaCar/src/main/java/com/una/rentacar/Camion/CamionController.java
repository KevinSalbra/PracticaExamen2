/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Camion;

/**
 *
 * @author Admin
 */
public class CamionController implements CamionInterface {

    private CamionConteiner container;

    public CamionController() throws Exception {
        container = new CamionConteiner();
    }

    @Override
    public String agregarCamion(String[] data) {
        String response = "Camion ingresado previamente.";
        if (!CamionConteiner.exist(data[0])) {

            try {
                Camion st = new Camion(data);
                if (container.agregarCamion(st)) {
                    response = "Guardado exitosamente";
                } else {
                    response = "Error al guarda los datos";
                }
            } catch (Exception e) {
                response = e.getMessage();
            }

        }
        return response;
    }

    @Override
    public String[] buscar(String id) {

        if (CamionConteiner.exist(id)) {
            Camion camion = container.buscarCamion(id);
            String CapCombustible = String.valueOf(camion.getCapacidadDeCombustible());
            String[] data = {camion.getId(), camion.getNumLlantas(), camion.getMarca(), camion.getCantPasajeros(), camion.getNumLlantas(),
                camion.getNacionalidad(), CapCombustible};
            return data;
        }
        return null;
    }

    @Override
    public Camion buscarCamion(String id) {

        if (container.buscarCamion(id) == null) {
            return null;
        } else {
             
            return container.buscarCamion(id);
        }

    }

    @Override
    public String eliminar(String id) {
        String response = " No se ha encontrado el camion. ";
        if (CamionConteiner.exist(id)) {
            if (CamionConteiner.eliminarCamion(id)) {
                response = " Se ha eliminado el camion de forma correcta. ";
            }
            return response;
        }
        return response;
    }
}
