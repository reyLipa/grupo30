
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="grupo30ulp";
    private static final String USER="root";
    private static final String PASSWORD="";
    private static Connection connection;

    
    private Conexion() {
    }
    
    public static Connection getConexion(){
        if (connection==null) {
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB, USER, PASSWORD);
                JOptionPane.showMessageDialog(null, "CONECTADO");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "error al cargar el Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion a la base de datos");
            }
            
        }
        return connection;
    
    
}
}