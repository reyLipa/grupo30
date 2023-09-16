/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class InscripcionData {
    private Connection conexion=null;

    public InscripcionData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion inscripto){
        String sql="INSERT INTO inscripcion( nota, idAlumno, idMateria)"
                + "VALUE(?, ?, ?, ?)";
        
        try {
            PreparedStatement ps=conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setDouble(1, inscripto.getNota());
             
            ps.setInt(2, inscripto.getAlumno().getIdAlumno());
            ps.setInt(3, inscripto.getMateria().getIdMateria());
            
           
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                inscripto.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion Registrada");
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
    
    }
    
    public List<Inscripcion> obtenerinscripciones() {

List<Inscripcion> inscripto = new ArrayList<>();

try {
String sql = "SELECT * FROM inscripcion";
PreparedStatement ps = conexion.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Inscripcion inscripcion = new Inscripcion();

inscripcion.setIdInscripcion(rs.getInt("IdInscripcion"));
inscripcion.setNota(rs.getDouble("nota"));
inscripcion.getAlumno().setIdAlumno(rs.getInt("IdAlumno"));
inscripcion.getMateria().setIdMateria(rs.getInt("IdMateria"));

inscripto.add(inscripcion);
}
ps.close();

} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripto "+ex.getMessage());
}
return inscripto;
}
    
    
    
}
