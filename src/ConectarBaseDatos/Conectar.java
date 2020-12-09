package ConectarBaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conectar {
    public Connection conectar = null;

    public Connection Conexion() {
       
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:supermercado.db?foreign_keys=on;";
            
            conectar = DriverManager.getConnection(dbURL);
            JOptionPane.showMessageDialog(null, "Se ha conectado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + " "+e.getMessage());
        }
        return conectar;
    }

    public void CerrarConexion() throws SQLException{
        if (conectar != null){
        conectar.close();
        
    }
    }
    
}
