/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Archivo_texto extends Archivo{
    String contenido;

    public Archivo_texto() {
        super();
    }

    public Archivo_texto(String nombre, int tamaño, Carpeta perteneceA) {
        super(nombre, tamaño, perteneceA);
    }

   

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
