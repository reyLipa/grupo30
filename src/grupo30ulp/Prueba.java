/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo30ulp;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import Entidades.Alumno;
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
       Connection conex=Conexion.getConexion();
       
       Alumno Juan=new Alumno(1234567, "Lopez", "Carlos", LocalDate.of(2000, Month.MARCH, 11), true);
    AlumnoData a=new AlumnoData();
    a.guardarAlumno(Juan);
    }
    
}
