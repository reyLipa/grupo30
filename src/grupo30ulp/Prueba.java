/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo30ulp;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author LAu
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();

       // Alumno Juan = new Alumno(1234567, "Lopez", "Carlos", LocalDate.of(2000, Month.MARCH, 11), true);
//        Alumno Juan1 = new Alumno(1234563, "Perez", "Jorge", LocalDate.of(2010, Month.JULY, 23), true);
//        Alumno Juan2 = new Alumno(1234507, "Vega", "Luisa", LocalDate.of(2011, Month.APRIL, 4), true);
//        Alumno Juan3 = new Alumno(12345867, "Miranda ", "María", LocalDate.of(2005, Month.MAY, 31), true);
//
//        AlumnoData a = new AlumnoData();
//   // a.guardarAlumno(Juan);
//     a.guardarAlumno(Juan1);
//      a.guardarAlumno(Juan2);
//       a.guardarAlumno(Juan3);


//        Alumno alumno = a.buscarAlumnoPorDni(1234507);
//        System.out.println("DNI: "+alumno.getNombre());
//        System.out.println("Apellido: "+alumno.getApellido());
        //a.modificarAlumno(Juan3);
       
//        System.out.println(a.listarAlumnos());
    //a.modificarAlumno(Set Nombre="julio" WHWERE dni=12345867);
    //inscripcion
    AlumnoData ad=new AlumnoData();
    MateriaData md=new MateriaData();
    InscripcionData id=new InscripcionData();
    
    Alumno lu=ad.buscarAlumno(4);
    Materia mate=md.buscarMateria(3);
    Inscripcion ins=new Inscripcion(9, lu, mate);
    id.guardarInscripcion(ins);
        
    }

}
