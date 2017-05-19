/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class Proyecto {
    String nombre;
    ArrayList<Archivo>lista_archivos=new ArrayList();
    ArrayList<Usuario>lista_usuario=new ArrayList();
    int commit;

    public Proyecto() {
    }

    public Proyecto(String nombre, int commit) {
        this.nombre = nombre;
        this.commit = commit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Archivo> getLista_archivos() {
        return lista_archivos;
    }

    public void setLista_archivos(ArrayList<Archivo> lista_archivos) {
        this.lista_archivos = lista_archivos;
    }

    public ArrayList<Usuario> getLista_usuario() {
        return lista_usuario;
    }

    public void setLista_usuario(ArrayList<Usuario> lista_usuario) {
        this.lista_usuario = lista_usuario;
    }

    public int getCommit() {
        return commit;
    }

    public void setCommit(int commit) {
        this.commit = commit;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
