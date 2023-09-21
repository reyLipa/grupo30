package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;

public class InscripcionData {

    private Connection conexion = null;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData matData = new MateriaData();

    public InscripcionData() {
        conexion = Conexion.getConexion();
    }
//GUARDAR INSCRIPCION
   public void guardarInscripcion(Inscripcion inscripto) {
        String sql = "INSERT INTO inscripcion( nota, idAlumno, idMateria)"
                + "VALUE(?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripto.getNota());

            ps.setInt(2, inscripto.getAlumno().getIdAlumno());
            ps.setInt(3, inscripto.getMateria().getIdMateria());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripto.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion Registrada");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripto " + ex.getMessage());
        }
     
    }
//OBTENER INSCRIPCION
    public List<Inscripcion> obtenerInscripciones() {

        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT idInscripcion, nota, idAlumno, idMateria FROM inscripcion";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alu);
                inscripcion.setMateria(mat);
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripto " + ex.getMessage());
        }
        return inscripciones;
    }

//OBTENER INSCRIPCION POR ALUMNO
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {

        ArrayList<Inscripcion> inscripto = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();

                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getDouble("nota"));
                Alumno alu=aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=matData.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alu);
                inscripcion.setMateria(mat);
               /*Alumno alu = aluData.buscarAlumno(rs.getInt("IdAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("IdMateria"));
                inscripcion.setAlumno(alu);
                inscripcion.setMateria(mat);*/
                
                inscripto.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripto " + ex.getMessage());
        }
        return inscripto;
    }

//OBTENER MATERIAS CURSADAS

    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, materia"
                + " WHERE inscripcion.idMateria = materia.idMateria + AND inscripcion.idAlumno=?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripto ");
        }
        return materias;
    }
//OBTENER MATERIAS NO CURSADAS

    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno=?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion ");
        }
        return materias;
    }
    //BORRAR INSCRIPCION MATERIA ALUMNO

    public void borrarInscripcionMateriaAlumno(int IdAlumno, int IdMateria) {
        String sql = "DELETE FROM inscripcion WHERE IdAlumno=? and IdMateria=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, IdAlumno);
            ps.setInt(2, IdMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripto ");
        }
    }
//ACTUALIZAR NOTA

    public void actualizarNota(double nota, int idAlumno, int idMateria) {
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? and idMateria=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripto ");
        }
    }
//OBTENER ALUMNO POR MATERIA
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        ArrayList<Alumno> alumnos=new ArrayList<>();
        String sql="SELECT a.idAlumno, dni, nombre, apellido, fechaNac, estado\n" +
"FROM inscripcion AS i JOIN alumno AS a ON i.idAlumno=a.idAlumno \n" +
"WHERE  idMateria=? AND estado=1";
        try {
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Alumno alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
            
        }
        return alumnos;
    }

    

}
