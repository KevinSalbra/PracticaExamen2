/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Camion;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class CamionConteiner extends CamionAdapter {

    private static Map<String, Camion> cCamion = new HashMap<String, Camion>();

     public CamionConteiner() throws Exception {
        super();
        File zCamion = new File("camion.scm");
        if (!zCamion.exists()) {
            zCamion.createNewFile();
            
        } else {
            loadFile();
        }
    }
    private void loadFile() throws Exception {
        ArrayList<Camion> data = this.read();
        for (Camion s : data) {
            cCamion.put(s.getId(), s);
        }
    }

    public static boolean exist(String id) {
        return cCamion.containsKey(id);
    }

    public boolean agregarCamion(Camion c) throws Exception {
        if (!cCamion.containsKey(c.getId())) {
            cCamion.put(c.getId(), c);
            this.write(new ArrayList(cCamion.values()));
            return true;
        }
        return false;
    }

    public Camion buscarCamion(String id) {
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
