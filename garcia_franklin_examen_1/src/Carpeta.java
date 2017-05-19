
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
public class Carpeta extends Archivo{

    ArrayList<Archivo>lista_archivo=new ArrayList();
    public Carpeta() {
        super();
    }

    public Carpeta(String nombre, int tamaño) {
        super(nombre, tamaño);
    }

    public ArrayList<Archivo> getLista_archivo() {
        return lista_archivo;
    }

    public void setLista_archivo(ArrayList<Archivo> lista_archivo) {
        this.lista_archivo = lista_archivo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
