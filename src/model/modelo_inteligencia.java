package model;

import include.Inteligencias;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class modelo_inteligencia extends conexion{
    public boolean insertarInteligencia(Inteligencias inteligencias) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO inteligencias (id_inteligencias, tipo_de_inteligencia) VALUES(?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, inteligencias.getId_inteligencias());
            pst.setString(2, inteligencias.getTipo_de_inteligencia());

            if(pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (getConection() != null) {
                    getConection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return  flag;
    }

    public ArrayList<Inteligencias> obtenerInteligencias(){
        ArrayList<Inteligencias> inteligencias = new ArrayList<Inteligencias>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_inteligencias, tipo_de_inteligencia FROM inteligencias";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()){
                inteligencias.add(new Inteligencias(rs.getInt("id_inteligencias"),
                        rs.getString("tipo_de_inteligencia")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(getConection() != null)getConection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
            }
        }
        return inteligencias;
    }
    public ArrayList<Inteligencias> obtenerInteligencias(int id_inteligencias){
        ArrayList<Inteligencias> inteligencias = new ArrayList<Inteligencias>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_inteligencias, tipo_de_inteligencia FROM inteligencias WHERE id_inteligencias = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_inteligencias);
            rs = pst.executeQuery();
            while (rs.next()){
                inteligencias.add(new Inteligencias(rs.getInt("id_inteligencias"),
                        rs.getString("tipo_de_inteligencia")));
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
        return inteligencias;
    }

    public boolean actualizarInteligencias(Inteligencias inteligencias){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "UPDATE inteligencias SET id_inteligencias = ?, tipo_de_inteligencia = ? WHERE  id_inteligencias = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,inteligencias.getId_inteligencias());
            pst.setString(2,inteligencias.getTipo_de_inteligencia());
            pst.setInt(3,inteligencias.getId_inteligencias());
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

    public boolean borrarInteligencias(int id_inteligencias){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "DELETE FROM inteligencias WHERE id_inteligencias = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, id_inteligencias);


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


