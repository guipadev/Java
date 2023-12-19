package Persistencia;

import Logica.Alumno;
import Logica.Carrera;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    // Creamos un objeto aluJPA haciendo una instancia la clase AlumnoJpaController
    // Asi vamos poder acceder a todos los metodos de nuestra controladora jpa
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    
    CarreraJpaController carreJPA = new CarreraJpaController();
    
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
    public void eliminarAlumno(int id) {
        try {
            aluJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Aqui ya recibimos los datos modificados distintos a la creacion y se procedera a cambiar en BD con esa informacion obtenida
    public void editarAlumno(int id) {
        try {
            aluJPA.edit(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJPA.findAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> listita = aluJPA.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno> (listita);
        return listaAlumnos;
    }
    
    // Carrera

    public void crearCarrera(Carrera carre) {
        carreJPA.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJPA.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJPA.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista = carreJPA.findCarreraEntities();
        
        ArrayList<Carrera> listaCarreras = new ArrayList(lista);
        
        return listaCarreras;
    }
    
}
