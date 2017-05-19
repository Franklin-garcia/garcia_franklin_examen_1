/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Archivo {
    String nombre;
    int tamaño;
    Carpeta perteneceA;
    public Archivo() {
    }

    public Archivo(String nombre, int tamaño, Carpeta perteneceA) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.perteneceA = perteneceA;
    }

    public Carpeta getPerteneceA() {
        return perteneceA;
    }

    public void setPerteneceA(Carpeta perteneceA) {
        this.perteneceA = perteneceA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return nombre;
    }
     
}
