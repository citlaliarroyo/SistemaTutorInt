package model;

import include.Datos_Cuenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modelodatos_cuenta extends conexion {
    public boolean insertardatos_cuenta(Datos_Cuenta datos_cuenta) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO datos_cuenta" + "(id_usuario, usuario, password)" + "VALUES(?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, datos_cuenta.getId_usuario());
            pst.setString(2, datos_cuenta.getUsuario());
            pst.setString(3, datos_cuenta.getPassword());

            if (pst.executeUpdate() == 1) {
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
        return flag;
    }
    public ArrayList<Datos_Cuenta> obtenerdatos_cuenta() {
        ArrayList<Datos_Cuenta> datos_cuenta = new ArrayList<Datos_Cuenta>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_usuario, usuario, password  FROM datos_cuenta";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                datos_cuenta.add(new Datos_Cuenta(rs.getInt("id_usuario"),
                        rs.getString("usuario"),
                        rs.getString("password")));
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

        return datos_cuenta;
    }

    public ArrayList<Datos_Cuenta> obtenerdatos_cuenta(int id_usuario){
        ArrayList<Datos_Cuenta> datos_cuenta = new ArrayList<Datos_Cuenta>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_usuario, usuario, password FROM datos_cuenta WHERE id_usuario = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_usuario);
            rs = pst.executeQuery();
            while (rs.next()){
                datos_cuenta.add(new Datos_Cuenta(rs.getInt("id_usuario"),
                        rs.getString("usuario"),
                        rs.getString("password")));
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
        return datos_cuenta;
    }

    public boolean actualizardatos_cuenta(Datos_Cuenta datos_cuenta){ PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "UPDATE datos_cuenta SET id_usuario = ?, usuario = ?, password = ? WHERE  id_usuario = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,datos_cuenta.getId_usuario());
            pst.setString(2,datos_cuenta.getUsuario());
            pst.setString(3,datos_cuenta.getPassword());
            pst.setInt(4,datos_cuenta.getId_usuario());


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

    public boolean borrardatos_cuenta(int id_usuario){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "DELETE FROM datos_cuenta WHERE id_usuario = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, id_usuario);


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
