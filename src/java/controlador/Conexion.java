package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private String user = "root";
    private String contraseña = "123456";
    private String host = "localhost";
    private String database = "paegdldb";
    private String classname = "com.mysql.cj.jdbc.Driver";
    private String puerto = "3306";
    private String timezone = "?useTimezone=true&serverTimezone=UTC";
    private String URL = "jdbc:mysql://" + host + ":" + puerto + "/" + database;

    public Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName(classname);
            conexion = (Connection) DriverManager.getConnection(URL, user, contraseña);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexion;
    }

}
