package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;

/*
Va a contener todos los metodos que vamos a necesitar, para despues llamarlos 
a nuestra persistencia que puedan ser creando con la BD

Por ejemplo si yo quiero crear un metodo create, va a estar aqui en la controladora
Y se va encargar de llamar al metodo create que se tenga en la controladora de persitencia
*/

public class Controladora {
    
    // ALumno
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    /*
     Metodo crear alumno para luego pasar a la persistencia
     Aqui se podria el dato de cada alumno por separado
     En nuestro caso los datos van a estar creados y recibimos el alumno completo
     @param alu 
     */
    
    /*
    Estos son procedimientos, no se consideran funciones
    Osea reciben o no valores hacen acciones en este caso en la BD
    Pero no tienen que retornar o devolver nada
    */
    
    // ALUMNO
    public void crearAlumno (Alumno alu) {
        controlPersis.crearAlumno (alu);
    }
    
    public void eliminarAlumno (int id) {
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno (Alumno alu) {
        controlPersis.editarAlumno(alu);
    }
    
    // Estos son metodos que retornan algun valor
    
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos () {
        return controlPersis.traerListaAlumnos();
    }
    
    // CARRERA
    public void crearCarrera (Carrera carre) {
        controlPersis.crearCarrera (carre);
    }
    
    public void eliminarCarrera (int id) {
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera (Carrera carre) {
        controlPersis.editarCarrera(carre);
    }
    
    // Estos son metodos que retornan algun valor
    
    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);
    }
    
    public ArrayList<Carrera> traerListaCarreras () {
        return controlPersis.traerListaCarreras();
    }
    
    // MATERIA
    public void crearMateria (Materia mate) {
        controlPersis.crearCarrera (mate);
    }
    
    public void eliminarMateria (int id) {
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria (Materia mate) {
        controlPersis.editarMateria(mate);
    }
    
    // Estos son metodos que retornan algun valor
    
    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);
    }
    
    public LinkedList<Materia> traerListaMaterias () {
        return controlPersis.traerListaMaterias();
    }

 }
