package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class TestJPA {

    public static void main(String[] args) {
        // Para realizar cualquier proceso descomentamos
        // Se comenta para que no se ejecute
        
        // Crear alumno en BD, estamos instanciando un nuevo alumno
        //Alumno alumno = new Alumno("123456", "Ernesto", "Perez", new Date("31/07/2022"));
        //Alumno alumno2 = new Alumno("654321", "Andres", "Camargo", new Date("01/05/2002"));
        //Alumno alumno3 = new Alumno("655644321", "Carlos", "Cifuentes", new Date("05/09/2022"));
        
        /*
        Hacemos referencia a la controladora de persistencia, mediante el objeto control
        Y accedemos al subjeto que queramos crearAlumno(), eliminarAlumno(), modificarAlumno(), traerAlumno()
        Y pasamos como parametro el alumno que creamos
        */
        ControladoraPersistencia control = new ControladoraPersistencia ();
        
        // CREAR
        //control.crearALumno(alumno);
        //control.crearALumno(alumno2);
        //control.crearALumno(alumno3);
        
        // ELIMINAR
        //control.eliminarAlumno("123456");
        
        // MODIFICAR, debe estar descomentada la linea de crear alumno en BD
        //alumno2.setApellido("Gonzales");
        //alumno2.setNombre("Alberto");
        //control.modificarAlumno(alumno2);
        
        // MOSTRAR LISTADO
        // Recorrer datos obtenidos de BD
        List <Alumno> listaAlumnos = control.traerAlumnos();
        
        System.out.println("\n A continuań se citan todos los alumnos:");
        
        for (Alumno alu : listaAlumnos) {
            System.out.println("- " + alu.getDni() + " " + alu.getNombre() + " " + alu.getApellido());
        }
        
        
        // MOSTRAR UN ALUMNO ESPECIFICO
        Alumno alu = control.traerAlumnoEnParticular ("654321");
        System.out.println("Alumno especifico solicitado: " + alu.getDni() + " " + alu.getNombre() + " " + alu.getApellido());
    }
}
