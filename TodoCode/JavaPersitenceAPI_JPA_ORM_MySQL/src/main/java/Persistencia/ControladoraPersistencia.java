package Persistencia;

import Logica.Alumno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    // Creamos un objeto aluJPA haciendo una instancia la clase AlumnoJpaController
    // Asi vamos poder acceder a todos los metodos de nuestra controladora jpa
    AlumnoJpaController aluJPA = new AlumnoJpaController ();
    
    
    /*
    Recibiar el objeto alumno que pasemos desde la logica
    Y va a intentar crearlo mediante JPA, mediante nuestro objeto aluJPA que es una instancia a la clase alumno jpa control
    */
    public void crearALumno (Alumno alu) {
        
        try {
            aluJPA.create(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Eliminar de acuerdo al id que se trae desde el main
    public void eliminarAlumno(String idAlumno) {
        try {
            aluJPA.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Aqui ya recibimos los datos modificados distintos a la creacion y se procedera a cambiar en BD con esa informacion obtenida
    public void modificarAlumno(Alumno alumno2) {
        try {
            aluJPA.edit(alumno2);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Vamos a buscar en BD toda la lista de alumnos
    public List<Alumno> traerAlumnos() {
        List <Alumno> listaAlumnos = aluJPA.findAlumnoEntities();
        return listaAlumnos;
    }

    // Vamos a buscar alumno en BD por ID
    public Alumno traerAlumnoEnParticular(String id) {
        Alumno alu = aluJPA.findAlumno(id);
        
        return alu;
    }
    
}
