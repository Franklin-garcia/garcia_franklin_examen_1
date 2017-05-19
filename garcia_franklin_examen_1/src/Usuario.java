
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Usuario {
     String nombre;
     int edad;
     String profesión;
     String username;
     String password;
     ArrayList<Proyecto>lista_proyecto=new ArrayList();
     
    public Usuario() {
    }

    public Usuario(String nombre, int edad, String profesión, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesión = profesión;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLista_proyecto(ArrayList<Proyecto> lista_proyecto) {
        this.lista_proyecto = lista_proyecto;
    }

    public ArrayList<Proyecto> getLista_proyecto() {
        return lista_proyecto;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
     
}
