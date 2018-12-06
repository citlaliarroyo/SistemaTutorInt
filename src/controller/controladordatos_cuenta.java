package controller;
import include.Datos_Cuenta;
import include.Datos_Personales;
import model.modelodatos_cuenta;
import model.modelodatos_personales;

import java.util.ArrayList;

public class controladordatos_cuenta {
    public boolean agregardatos_cuenta(Datos_Cuenta datos_cuenta){
        modelodatos_cuenta datos_cuenta1 = new modelodatos_cuenta();
        return datos_cuenta1.insertardatos_cuenta(datos_cuenta);
    }
    public ArrayList<Datos_Cuenta> obtenerdatos_cuenta() {
        modelodatos_cuenta datos_cuenta = new modelodatos_cuenta();
        return datos_cuenta.obtenerdatos_cuenta();
    }
    public ArrayList<Datos_Cuenta> obtenerdatos_cuenta(int id_usuario){
        modelodatos_cuenta datos_cuenta = new modelodatos_cuenta();
        return datos_cuenta.obtenerdatos_cuenta(id_usuario);
    }
    public boolean actualizardatos_cuenta(Datos_Cuenta datos_cuenta){
        modelodatos_cuenta datos_cuenta1 = new modelodatos_cuenta();
        return datos_cuenta1.actualizardatos_cuenta(datos_cuenta);
    }

    public boolean eliminardatos_cuenta(int id_usuario){
        modelodatos_cuenta datos_cuenta1 = new modelodatos_cuenta();
        return datos_cuenta1.borrardatos_cuenta(id_usuario);
    }

    public static void main(String[] args){
        controladordatos_cuenta cc = new controladordatos_cuenta();
       System.out.print(cc.agregardatos_cuenta(new Datos_Cuenta(2,"puchis","citlali")));
        ArrayList<Datos_Cuenta> datos_cuenta = new ArrayList<Datos_Cuenta>();
        datos_cuenta = cc.obtenerdatos_cuenta();
        for (int b=0;b<datos_cuenta.size();b++){
            System.out.println("id_usuario:" + datos_cuenta.get(b).getId_usuario());
            System.out.println("usuario:" + datos_cuenta.get(b).getUsuario());
            System.out.println("password:" + datos_cuenta.get(b).getPassword());

            System.out.println();
    }
        //Modificar un elemento
        //System.out.println(cc.actualizardatos_cuenta(new Datos_Cuenta(2, "puchi","citlali")));

        //Listar un elemento de la tabla por su llave primaria
        ArrayList<Datos_Cuenta> datos_cuentas = new ArrayList<Datos_Cuenta>();
        datos_cuenta = cc.obtenerdatos_cuenta(2);

        for (int b=0;b<datos_cuenta.size();b++){
            System.out.println("id_usuario:" + datos_cuenta.get(b).getId_usuario());
            System.out.println("usuario:" + datos_cuenta.get(b).getUsuario());
            System.out.println("password:" + datos_cuenta.get(b).getPassword());
            System.out.println();
        }

        //Eliminar un elemento
        //System.out.println(cc.eliminardatos_cuenta(2));
    }
}
