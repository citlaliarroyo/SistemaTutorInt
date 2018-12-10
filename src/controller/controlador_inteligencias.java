package controller;

import include.Inteligencias;
import model.modelo_inteligencia;

import java.util.ArrayList;

public class controlador_inteligencias {

    public boolean agregarInteligencias(Inteligencias inteligencias) {
        modelo_inteligencia inteligencia1 = new modelo_inteligencia();
        return inteligencia1.insertarInteligencia(inteligencias);
    }

    public static void main(String[] args) {

        controlador_inteligencias cc = new controlador_inteligencias();
        //Agregar un elemento
        System.out.print(cc.agregarInteligencias(new Inteligencias( 1,"Artificial")));

        //listar todos los elementos de la tabla
        ArrayList<Inteligencias> inteligencias = new ArrayList<Inteligencias>();
        inteligencias = cc.obtenerInteligencias();
        for (int a = 0; a < inteligencias.size(); a++) {
            System.out.println("id_inteligencias:" + inteligencias.get(a).getId_inteligencias());
            System.out.println("tipo_de_inteligencia:" + inteligencias.get(a).getTipo_de_inteligencia());
            System.out.println();
        }

        //Listar un elemento de la tabla por su llave primaria
        ArrayList<Inteligencias> inteligencias1 = new ArrayList<Inteligencias>();
        inteligencias = cc.obtenerInteligencias(1);

        for (int b = 0; b < inteligencias.size(); b++) {
            System.out.println("id_inteligencias:" + inteligencias.get(b).getId_inteligencias());
            System.out.println("tipo_de_inteligencia:" + inteligencias.get(b).getTipo_de_inteligencia());
            System.out.println();
        }

        //Modificar un elemento
        System.out.println(cc.actualizarInteligencias(new Inteligencias(1, "Humana")));

        //Eliminar un elemento
        //System.out.println(cc.eliminarInteligencias(2));

    }
    public ArrayList<Inteligencias> obtenerInteligencias() {
        modelo_inteligencia inteligencias = new modelo_inteligencia();
        return inteligencias.obtenerInteligencias();
    }
    public ArrayList<Inteligencias> obtenerInteligencias(int id_inteligencias){
        modelo_inteligencia inteligencias = new modelo_inteligencia();
        return inteligencias.obtenerInteligencias(id_inteligencias);
    }
    public boolean actualizarInteligencias(Inteligencias inteligencias){
        modelo_inteligencia inteligencias1 = new modelo_inteligencia();
        return inteligencias1.actualizarInteligencias(inteligencias);
    }
    public boolean eliminarInteligencias(int id_inteligencias){
        modelo_inteligencia inteligencias1 = new modelo_inteligencia();
        return inteligencias1.borrarInteligencias(id_inteligencias);
    }
}


