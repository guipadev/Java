package co.yom.persistencia;

import co.yom.logica.Alumno;
import co.yom.logica.Carrera;
import co.yom.logica.Materia;
import co.yom.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controlar cada una de las instancia de jpa de las jpa controller Recibe las
 * peticiones desde la lógica o lugar que mandemos y en base a eso sabe a quien
 * delegar dependeiendo del JpaController
 */
public class ControladoraPersistencia {

    AlumnoJpaController aluJpa = new AlumnoJpaController();

    CarreraJpaController carreJpa = new CarreraJpaController();
    
    MateriaJpaController mateJpa = new MateriaJpaController();
    
    /******************* ALUMNO *******************/
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    
    public void eliminarAlumno(int id) {

        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        // Recibimos la devolucion en una lista
        List<Alumno> listita = aluJpa.findAlumnoEntities();

        // Transformamos lista, no hacer casteo
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);

        return listaAlumnos;
    }
    
    /******************* CARRERA *******************/
    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        // Recibimos la devolucion en una lista
        List<Carrera> lista = carreJpa.findCarreraEntities();

        // Transformamos lista, no hacer casteo
        ArrayList<Carrera> listaCarreras = new ArrayList(lista);

        return listaCarreras;
    }

    public void crearCarrera(Materia mate) {
        mateJpa.create(mate);
    }

    /******************* MATERIA ********************/
    public void crearMateria(Materia mate) {
        mateJpa.create(mate);
    }
    
    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public LinkedList<Materia> traerListaMaterias() {
        List<Materia> lista = mateJpa.findMateriaEntities();
        LinkedList<Materia> listaMaterias = new LinkedList(lista);
        return listaMaterias;
    }
    
}
