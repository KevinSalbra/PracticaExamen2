/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosDetexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class ArchivosDetexto {

    File archivo;

    private void crearArchivoDetexto() {
        archivo = new File("Prueba1.txt");

        try {

            if (archivo.createNewFile()) {

                System.out.println("se creo el archivo correctamente");

            } else {

                System.out.println("No se pudo crear el archivo");

            }

        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private void eliminarArchivo() {
        if (archivo.delete()) {

            System.out.println("se elimino el archivo correctamente");

        } else {

            System.out.println("No se pudo eliminar el archivo");

        }
    }

    private void escribirEnElArchivo() {
        try {
            FileWriter escribir = new FileWriter(archivo);

            escribir.write("Kevin comelon!!!");
            escribir.write("\nKevin chupador!!!");
            escribir.close();
            System.out.println("Se agrego el texto");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }
    
    private void leerArchivoDetexto(){
        String contenido;
        
        try{
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            
            contenido = lectura.readLine();
            
            while(contenido != null){
                System.out.println(contenido);
                contenido = lectura.readLine();
            }
            
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
        
    }

    public static void main(String[] args) {

        ArchivosDetexto archivo = new ArchivosDetexto();
        archivo.crearArchivoDetexto();
        archivo.escribirEnElArchivo();
        archivo.leerArchivoDetexto();
    }

}
