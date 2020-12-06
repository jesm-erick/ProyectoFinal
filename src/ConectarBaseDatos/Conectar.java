
package ConectarBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conectar {
    public Connection conectar = null;
    
    public Connection Conexion (){
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:supermercado_db.db?foreign_keys=on;";
            conectar = DriverManager.getConnection(dbURL);
            JOptionPane.showMessageDialog(null, "Se ha conectado correctamente");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conectar;
    }

    public static void CerrarConexion(Connection conectar){
        try {
            if (conectar != null) {
                conectar.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
