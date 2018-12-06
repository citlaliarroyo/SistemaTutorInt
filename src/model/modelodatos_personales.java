package model;

import include.Datos_Personales;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modelodatos_personales extends conexion{

    public boolean insertardatos_personales(Datos_Personales datos_personales) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO datos_personales (id_datos, nombre, a_paterno, a_materno, edad, id_tipo, id_usuario) VALUES(?,?,?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, datos_personales.getId_datos());
            pst.setString(2, datos_personales.getNombre());
            pst.setString(3, datos_personales.getA_paterno());
            pst.setString(4, datos_personales.getA_materno());
            pst.setInt(5, datos_personales.getEdad());
            pst.setInt(6, datos_personales.getId_tipo());
            pst.setInt(7, datos_personales.getId_usuario());

            if(pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return  flag;
    }
 public ArrayList<Datos_Personales> obtenerdatos_personales() {
     ArrayList<Datos_Personales> datos_personales = new ArrayList<Datos_Personales>();
     PreparedStatement pst = null;
     ResultSet rs = null;
     try {
         String consulta = "SELECT id_datos, nombre, a_paterno, a_materno, edad, id_tipo, id_usuario  FROM datos_Personales";
         pst = getConection().prepareCall(consulta);
         rs = pst.executeQuery();
         while (rs.next()) {
             datos_personales.add(new Datos_Personales(rs.getInt("id_datos"),
                     rs.getString("nombre"),
                     rs.getString("a_paterno"),
                     rs.getString("a_materno"),
                     rs.getInt("edad"),
                     rs.getInt("id_tipo"),
                     rs.getInt("id_usuario")));
         }
     } catch (Exception e) {
     } finally {
         try {
             if (getConection() != null) getConection().close();
             if (pst != null) pst.close();
             if (rs != null) rs.close();
         } catch (Exception e) {

         }
     }

     return datos_personales;
        }

 public ArrayList<Datos_Personales> obtenerdatos_personales(int id_datos){
        ArrayList<Datos_Personales> datos_personales = new ArrayList<Datos_Personales>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_datos, nombre, a_paterno, a_materno, edad, id_tipo, id_usuario FROM datos_personales WHERE id_datos = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_datos);
            rs = pst.executeQuery();
            while (rs.next()){
                datos_personales.add(new Datos_Personales(rs.getInt("id_datos"),
                        rs.getString("nombre"),
                        rs.getString("a_paterno"),
                        rs.getString("a_materno"),
                        rs.getInt("edad"),
                        rs.getInt("id_tipo"),
                        rs.getInt("id_usuario")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(getConection() != null)getConection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return datos_personales;
    }

    public boolean actualizardatos_personales(Datos_Personales datos_personales){ PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "UPDATE datos_personales SET id_datos = ?, nombre = ?, a_paterno = ?, a_materno = ?, edad = ?, id_tipo = ?, id_usuario = ? WHERE  id_datos = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,datos_personales.getId_datos());
            pst.setString(2,datos_personales.getNombre());
            pst.setString(3,datos_personales.getA_paterno());
            pst.setString(4, datos_personales.getA_materno());
            pst.setInt(5, datos_personales.getEdad());
            pst.setInt(6, datos_personales.getId_tipo());
            pst.setInt(7, datos_personales.getId_usuario());
            pst.setInt(8, datos_personales.getId_datos());

            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception a) {
                System.out.println(a.getMessage());
            }
        }
        return flag;
    }

    public boolean borrardatos_personales(int id_datos){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "DELETE FROM datos_personales WHERE id_datos = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, id_datos);


            if(pst.executeUpdate() == 1){
                flag = true;
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }
}

