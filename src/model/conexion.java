package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion{
    private String user = "puchis";
    private String password = "puchis";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "sistematutor";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?noAccessToProcedureBodies=true";
    private Connection con;

    public conexion(){
        try{
            Class.forName(classname);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException esql) {
            System.err.println(esql.getMessage());
        }
    }
    public Connection getConection() { return con;}
}
