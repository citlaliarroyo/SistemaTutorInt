package controller;
import include.Tipo_Usuario;
import model.modelotipo_usuario;

import java.util.ArrayList;


public class controladortipo_usuario {

    public boolean agregartipo_usuario(Tipo_Usuario tipo_usuario){
        modelotipo_usuario tipo_usuario1 = new modelotipo_usuario();
        return tipo_usuario1.insertartipo_usuario(tipo_usuario);
    }
    public ArrayList<Tipo_Usuario> obtenertipo_usuario(){
        modelotipo_usuario tipo_usuario = new modelotipo_usuario();
        return tipo_usuario.obtenertipo_usuario();
    }
    public ArrayList<Tipo_Usuario> obtenertipo_usuario(int id_tipo){
        modelotipo_usuario tipo_usuario = new modelotipo_usuario();
        return tipo_usuario.obtenertipo_usuario(id_tipo);
    }
    public boolean actualizartipo_usuario(Tipo_Usuario tipo_usuario){
        modelotipo_usuario tipo_usuario1 = new modelotipo_usuario();
        return tipo_usuario1.actualizartipo_usuario(tipo_usuario);
    }
    public boolean eliminartipo_usuario(int id_tipo){
        modelotipo_usuario tipo_usuario1 = new modelotipo_usuario();
        return tipo_usuario1.borrartipo_usuario(id_tipo);
    }

    public static void main(String[] args){
        controladortipo_usuario cc = new controladortipo_usuario();
        System.out.print(cc.agregartipo_usuario(new Tipo_Usuario(3,"Directora")));
        ArrayList<Tipo_Usuario> tipo_usuario = new ArrayList<Tipo_Usuario>();
        tipo_usuario = cc.obtenertipo_usuario();
        for (int a=0;a<tipo_usuario.size();a++){
            System.out.println("id_tipo"+ tipo_usuario.get(a).getId_tipo());
            System.out.println("nombre_tipo_usuario"+ tipo_usuario.get(a).getNombre_tipo_usuario());
            System.out.println();
        }
        //Modificar un elemento
        //System.out.println(cc.actualizartipo_usuario(new Tipo_Usuario(3, "Dueña")));

        //Listar un elemento de la tabla por su llave primaria
        ArrayList<Tipo_Usuario> tipo_usuarios = new ArrayList<Tipo_Usuario>();
        tipo_usuario = cc.obtenertipo_usuario(3);

        for (int b=0;b<tipo_usuario.size();b++){
            System.out.println("id_tipo:" + tipo_usuario.get(b).getId_tipo());
            System.out.println("nombre_tipo_usuario:" + tipo_usuario.get(b).getNombre_tipo_usuario());
            System.out.println();
        }

        //Eliminar un elemento
        //System.out.println(cc.eliminartipo_usuario(3));
    }
}

