
package AccesoADatos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AlumnoData {
    
    private Connection conexion=null;
     
    public AlumnoData(){//constructor de la variable date va inicializar la variable con
        conexion=Conexion.getConexion();//esta clase conexion hace la conexion a la bd
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNac, estado )"
                + "VALUE(?, ?, ?, ?, ?)";
            
        try {
            PreparedStatement ps=conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                 alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "alumno guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno"); }
    }
    
    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNac FROM alumno WHERE idAlumno = ? AND estado = true";
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");

            }
   ps.close();
} catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage()); 

}

return alumno;
 }
    
     public Alumno buscarAlumnoPorDni(int dni) {
Alumno alumno = null;
String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNac FROM alumno WHERE dni=? AND estado = 1";
PreparedStatement ps = null;
try {
 ps = conexion.prepareStatement(sql);
 ps.setInt(1,dni );
 ResultSet rs = ps.executeQuery();

 if (rs.next()) {
 alumno=new Alumno();
 alumno.setIdAlumno(rs.getInt("idAlumno"));
 alumno.setDni(rs.getInt("dni"));
 alumno.setApellido(rs.getString("apellido"));
 alumno.setNombre(rs.getString("nombre"));
 alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
 alumno.setEstado(true);


 } else {
 JOptionPane.showMessageDialog(null, "No existe el alumno"); 

}
 ps.close();
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
 }


 return alumno;
   
}
    
    
    
    
    
    }