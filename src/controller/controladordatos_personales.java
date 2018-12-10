package controller;
import include.Datos_Personales;
import include.Datos_Cuenta;
import include.Tipo_Usuario;
import model.modelodatos_personales;

import java.util.ArrayList;

public class controladordatos_personales {

    public boolean agregardatos_personales(Datos_Personales datos_personales) {
        modelodatos_personales datos_personales1 = new modelodatos_personales();
        return datos_personales1.insertardatos_personales(datos_personales);
    }


    public static void main(String[] args) {

        controladordatos_personales cc = new controladordatos_personales();
        //Agregar un elemento
        System.out.print(cc.agregardatos_personales(new Datos_Personales( 2,"Israel","Arroyo","Pineda",59,1,3)));

        //listar todos los elementos de la tabla
        ArrayList<Datos_Personales> datos_personales = new ArrayList<Datos_Personales>();
        datos_personales = cc.obtenerdatos_personales();
        for (int a = 0; a < datos_personales.size(); a++) {
            System.out.println("id_datos:" + datos_personales.get(a).getId_datos());
            System.out.println("nombre:" + datos_personales.get(a).getNombre());
            System.out.println("a_paterno:" + datos_personales.get(a).getA_paterno());
            System.out.println("a_materno:" + datos_personales.get(a).getA_materno());
            System.out.println("edad:" + datos_personales.get(a).getEdad());
            System.out.println("id_tipo:" + datos_personales.get(a).getId_tipo());
            System.out.println("id_usuario:" + datos_personales.get(a).getId_usuario());
            System.out.println();
        }

        //Listar un elemento de la tabla por su llave primaria
        ArrayList<Datos_Personales> datos_personalesl = new ArrayList<Datos_Personales>();
        datos_personales = cc.obtenerdatos_personales(1);

        for (int b = 0; b < datos_personales.size(); b++) {
            System.out.println("id_datos:" + datos_personales.get(b).getId_datos());
            System.out.println("nombre:" + datos_personales.get(b).getNombre());
            System.out.println("a_paterno:" + datos_personales.get(b).getA_paterno());
            System.out.println("a_materno:" + datos_personales.get(b).getA_materno());
            System.out.println("edad:" + datos_personales.get(b).getEdad());
            System.out.println("id_tipo:" + datos_personales.get(b).getId_tipo());
            System.out.println("id_usuario:" + datos_personales.get(b).getId_usuario());
            System.out.println();
        }

        //Modificar un elemento
        System.out.println(cc.actualizardatos_personales(new Datos_Personales(1, "Citlali", "Arroyo", "Romero", 22, 2, 1)));

        //Eliminar un elemento
        //System.out.println(cc.eliminardatos_personales(2));

    }
        public ArrayList<Datos_Personales> obtenerdatos_personales() {
            modelodatos_personales datos_personales = new modelodatos_personales();
            return datos_personales.obtenerdatos_personales();
        }

    public ArrayList<Tipo_Usuario> obtenerid_tipoFK() {
        modelodatos_personales tipo_usuario = new modelodatos_personales();
        return tipo_usuario.obtenerid_tipoFK();
    }
        public ArrayList<Datos_Cuenta> obtenerid_usuarioFK() {
            modelodatos_personales datos_cuenta = new modelodatos_personales();
            return datos_cuenta.obtenerid_usuarioFK();
        }

    public ArrayList<Datos_Personales> obtenerdatos_personales(int id_datos){
        modelodatos_personales datos_personales = new modelodatos_personales();
        return datos_personales.obtenerdatos_personales(id_datos);
    }
    public boolean actualizardatos_personales(Datos_Personales datos_personales){
        modelodatos_personales datos_personales1 = new modelodatos_personales();
        return datos_personales1.actualizardatos_personales(datos_personales);
    }
    public boolean eliminardatos_personales(int id_datos){
        modelodatos_personales datos_personales1 = new modelodatos_personales();
        return datos_personales1.borrardatos_personales(id_datos);
    }

    }







