/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class MateriaData {
    private Connection conexion=null;
     
    public MateriaData(){
        conexion=Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql="INSERT INTO materia(nombre, anio, estado) VALUES "
                + "(?, ?, ?)";
           try {
            PreparedStatement ps=conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                 materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia"); }
    
    }
    
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, anio, estado FROM materia WHERE idMateria = ? AND estado = true";
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                
               materia.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");

            }
   ps.close();
} catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage()); 

}

return materia;
 }
    
    
    public void modificarAlumno(Materia materia){

 String sql = "UPDATE materia SET nombre = ?, anio = ? estado = true WHERE idMateria = ?";
 PreparedStatement ps = null; 
 try {
 ps = conexion.prepareStatement(sql);
 
 ps.setString(1, materia.getNombre());
 ps.setInt(2, materia.getAnio());
 materia.setEstado(true);
 
 int exito = ps.executeUpdate();
 if (exito == 1) {
 JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
 } else {
 JOptionPane.showMessageDialog(null, "La Materia no existe");
 }

 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
 }

 }
    
    public void eliminarMateria(int id) { 
 try {
 String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
 PreparedStatement ps = conexion.prepareStatement(sql);
ps.setInt(1, id);
 int fila=ps.executeUpdate();
 if(fila==1){
JOptionPane.showMessageDialog(null, " Se eliminó la Materia");
 }
 ps.close();
 } catch (SQLException e) {
JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
 }
    }
    
    

/*public List<Materia> listarMaterias() {
    List<Materia> materias = new ArrayList<>();
try {
String sql = "SELECT * FROM materia WHERE estado = 1 ";
PreparedStatement ps = conexion.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Materia materia= new Materia();

materia.setIdMateria(rs.getInt("idMateria"));
materia.setNombre(rs.getString("nombre"));


alumno.setAnio(rs.getDate("fechaNac").toLocalDate());
alumno.setEstado(rs.getBoolean("estado"));
alumnos.add(alumno);
}
ps.close();

} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
}
return alumnos;
}*/
}
