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
    
//    Alumno lu=ad.buscarAlumno(9);
//    Materia mate=md.buscarMateria(1);
//    Inscripcion ins=new Inscripcion(8, lu, mate);
//    id.guardarInscripcion(ins);
    
   // id.obtenerInscripciones();
//    Alumno Marce=ad.buscarAlumno(3);
//    Materia analisis=md.buscarMateria(6);
    //Inscripcion in=new Inscripcion(8, Marce, analisis);
   //id.guardarInscripcion(in);
   
   //PARA ACTUALIZAR NOTA
//   Alumno Marce=ad.buscarAlumno(3);
//    Materia analisis=md.buscarMateria(6);
//    id.actualizarNota(8, 3, 6);

    //PARA BORRAR MATERIA
    
    //id.borrarInscripcionMateriaAlumno(10, 5);
    
//    Alumno alu3=ad.buscarAlumno(3);
//    Materia mat3=md.buscarMateria(6);
//    Inscripcion in3=new Inscripcion(5, alu3, mat3);
    //id.guardarInscripcion(in3);
       //id.actualizarNota(7, 4, 3);
  // id.borrarInscripcionMateriaAlumno(4, 3);
    
//    
//        for (Inscripcion inscrip : id.obtenerInscripcionesPorAlumno(10)) {
//            
//            System.out.println("id "+inscrip.getIdInscripcion());
//            System.out.println(" apellido "+inscrip.getAlumno().getApellido());
//            System.out.println(" Materia "+inscrip.getMateria().getNombre());
//            
//            
//        }

//for(Materia materia:id.obtenerMateriasNoCursadas(1)){
//    System.out.println("nombre "+materia.getNombre());
//}
//    for (Alumno alu:id.obtenerAlumnosXMateria(2)) {
////            
//            System.out.println("nombre "+alu.getNombre());
//            System.out.println(" apellido "+alu.getApellido());
//            System.out.println(" dni "+alu.getDni());
////            
////            
//        }

//PRUEBAS METODOS MATERIAAlumno Juan3 = new Alumno(12345867, "Miranda ", "María", LocalDate.of(2005, Month.MAY, 31), true);
//GUARDAR MATERIA
        Materia mat1 = new Materia("Matematicas",2,true);
        Materia mat2 = new Materia("Fisica",1,true);
        Materia mat3 = new Materia("Programacion",3,true);
        Materia mat4 = new Materia("Biologia",1, true);
        MateriaData m = new MateriaData();
        
//        m.guardarMateria(mat1);
//        m.guardarMateria(mat2);
//        m.guardarMateria(mat3);
//        m.guardarMateria(mat4);
        
        m.modificarMateria(mat4);
        //m.eliminarMateria(5);
        
          // System.out.println(m.listarMaterias());
            
        
        
    }

}
