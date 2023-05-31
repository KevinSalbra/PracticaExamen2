/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import com.una.rentacar.Motocicleta.Motocicleta;

/**
 *
 * @author Admin
 */
public class Persona {

    private Integer edad;
    private String nombre;
    private String nacionalidad;
    private String identificacion;
    private Motocicleta moto;
    
    public Persona(String[] data,String [] moto) {
        this.moto = new Motocicleta(moto);
        this.edad = Integer.valueOf(data[0]);
        this.nombre = data[1];
        this.nacionalidad = data[2];
        this.identificacion = data[3];
        
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Motocicleta getMoto() {
        return moto;
    }

    public void setMoto(Motocicleta moto) {
        this.moto = moto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad +"\n"+ ", nombre=" + nombre +"\n"+ ", nacionalidad=" + nacionalidad +"\n"+ "Identificacion="+identificacion +"\n"+ ", moto=" + moto +"\n"+'}';
    }
    
    

}
