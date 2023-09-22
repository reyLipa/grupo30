package grupo30ulp;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;

public class Prueba {

    public static void main(String[] args) {

////GUARDAR  ALUMNO
//        Alumno Juan = new Alumno(1234567, "Lopez", "Carlos", LocalDate.of(2000, Month.MARCH, 11), true);
//        Alumno Juan1 = new Alumno(1234563, "Perez", "Jorge", LocalDate.of(2010, Month.JULY, 23), true);
//        Alumno Juan2 = new Alumno(1234507, "Vega", "Luisa", LocalDate.of(2011, Month.APRIL, 4), true);
//        Alumno Juan3 = new Alumno(12345878, "Rodriguez ", "Pablo", LocalDate.of(2005, Month.MAY, 31), true);
//
        AlumnoData a = new AlumnoData();
//        a.guardarAlumno(Juan);
//        a.guardarAlumno(Juan1);
//        a.guardarAlumno(Juan2);
//        a.guardarAlumno(Juan3);
////BUSCAR ALUMNO
//        Alumno alumnoEncontrado = a.buscarAlumno(8);
//        if (alumnoEncontrado != null) {
//            System.out.println("Nombre " + alumnoEncontrado.getNombre());
//       System.out.println("Apellido: "+alumnoEncontrado.getApellido());}
////BUSCAR ALUMNO POR DNI
//       Alumno alumno = a.buscarAlumnoPorDni(12345868);
//        if (alumno != null) {
//            System.out.println("Nombre " + alumno.getNombre());
//            System.out.println("Apellido: "+alumno.getApellido());}
////MODIFICAR ALUMNO
//      Alumno Juan5 = new Alumno(3, 12345878, "Rodriguez ", "Mario", LocalDate.of(2005, Month.MAY, 31), true);
//      a.modificarAlumno(Juan5);
////LISTAR ALUMNOS
//      for (Alumno alumno : a.listarAlumnos()) {
//            System.out.println(alumno.getDni());
//            System.out.println(alumno.getNombre());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getFechaNac());
//     }
///ELIMINAR ALUMNO
//         a.eliminarAlumno(1);
/////////////////////////////////////////////////////////////
////GUARDAR MATERIA
//        Materia mat1 = new Materia("Matematicas",2020,true);
//        Materia mat2 = new Materia("Fisica",1,true);
//        Materia mat3 = new Materia("Programacion",2,true);
//        Materia mat5 = new Materia("Electricidad", 3, true);
        MateriaData m = new MateriaData();

//        m.guardarMateria(mat1);
//        m.guardarMateria(mat2);
//        m.guardarMateria(mat3);
//        m.guardarMateria(mat5);
// //BUSCAR MATERIA 
//       
//      Materia materiaEncontrada = m.buscarMateria(4);
//        if (materiaEncontrada != null) {
//            System.out.println("nombre: " + materiaEncontrada.getNombre());
//            System.out.println("anio: "+materiaEncontrada.getAnio());}
////MODIFICAR MATERIA
//        Materia mat2 = new Materia(2, "Español2", 2021, true);
//        m.modificarMateria(mat2); 
////ELIMINAR MATERIA
//        m.eliminarMateria(2);
////LISTAR MATERIA
//       for(Materia materias :m.listarMaterias()){
//       System.out.println(materias.getIdMateria());
//       System.out.println(materias.getNombre());
//       System.out.println(materias.getAnio());
//       }
// /////////////////////////////////////
////GUARDA INSCRIPCION 
//        AlumnoData ad = new AlumnoData();
//        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();

//        Alumno luisa = ad.buscarAlumno(3);
//        Materia matem = md.buscarMateria(3);
//        Inscripcion insc1 = new Inscripcion(luisa, matem, 4);
//        id.guardarInscripcion(insc1);
////OBTENER INSCRIPCIONES
//            for(Inscripcion insc:id.obtenerInscripciones()){
//            System.out.println("id: "+insc.getIdInscripcion());
//            System.out.println("Apellido: "+insc.getAlumno().getApellido());
//            System.out.println("Materia: "+insc.getMateria().getNombre());
//       }
///OBTENER INSCRIPCION POR ALUMNO
//           for (Inscripcion inscripto : id.obtenerInscripcionesPorAlumno(3)) {
//            
//            System.out.println("id "+inscripto.getIdInscripcion());
//            System.out.println(" apellido "+inscripto.getAlumno().getApellido());
//            System.out.println(" Materia "+inscripto.getMateria().getNombre());
//     }
///OBTENER MATERIAS CURSADAS////
        for (Materia materia : id.obtenerMateriasCursadas(3)) {
            System.out.println("nombre " + materia.getNombre());
        }
///OBTENER MATERIAS NO CURSADAS
//for(Materia materia:id.obtenerMateriasNoCursadas(2)){
//        System.out.println("nombre "+materia.getNombre());
//    }
///BORRAR INSCRIPCION MATERIA ALUMNO/////
//     id.borrarInscripcionMateriaAlumno(2, 3);        
//   
///ACTUALIZAR NOTA 
//id.actualizarNota(4, 3, 1);
///OBTENER ALUMNOS X MATERIA
//for (Alumno alumnos:id.obtenerAlumnosXMateria(2)) {            
//            System.out.println("nombre: "+alumnos.getNombre());
//            System.out.println("Apellido: "+alumnos.getApellido());
//           
//    
//}
    }
}
//continuara...