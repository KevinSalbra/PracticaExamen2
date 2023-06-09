/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.rentacar.Camion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class CamionAdapter {
    public CamionAdapter(){
        
    }
    protected void write(ArrayList<Camion> list) throws Exception{
        ObjectOutputStream out=null;
        try{
            out=new ObjectOutputStream(
                    new FileOutputStream("camion.scm"));
            for(int i=0;i<list.size();i++){
                out.writeObject(list.get(i));
            }
        }catch(IOException ex){
            throw new Exception("Error de escritura del archivo");
        }finally{
            out.close();
        }
    }
    protected ArrayList<Camion> read() throws Exception{
        ObjectInputStream in;
        ArrayList<Camion> list=new ArrayList<>();
        try{
            in=new ObjectInputStream(new FileInputStream("camion.scm"));
            if(in!=null){
                Camion st=(Camion)in.readObject();
                while(st!=null){
                    list.add(st);
                    st=(Camion)in.readObject();
                }                
            }
            in.close();
        }catch(IOException|ClassNotFoundException ex){
            if(!(ex instanceof EOFException)){
                throw new Exception(ex.getMessage());
            }
        }
        return list;
    }
}
