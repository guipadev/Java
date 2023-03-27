package com.mycompany.jpaprueba;


import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.LinkedList;


public class JpaPrueba {

    public static void main(String[] args) {
        
        // Se creara en BD tabla alumno y sequence(cuenta la frecuencia ID que se va creando) 
        
        // Llamamos la controladora persitencia directamente desde el main
        // porque todavia no teniamos la controladora de logica
        //ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        // ControladoraLogica llamara a ControladoraPersistencia, 
        // cumpliendo el modelo de capas
        // Realizaremos el proceso creacion usuario con datos quemados, porque esta informacion
        // la recibiremos normalmente del frotend y recibira en la controladora de la logica
        // Y no aquí en le main
        Controladora control = new Controladora();
        
               
        // ELIMINAR por el ID alumno
        //control.eliminarAlumno(35);
        
        // EDITAR alumno
        //alu.setApellido("De paula");
        //control.editarAlumno(alu);
        
        // Recibimos en un variable datos de un alumno
        //Alumno alu = control.traerAlumno(35);
        //System.out.println("---------- BUSQUEDA INDIVIDUAL ----------");
        //System.out.println("El alumno es: " + alu.toString());
        
        //System.out.println("---------- BUSQUEDA DE TODOS ----------");
        
        //ArrayList<Alumno> listaDeAlumnos = control.traerListaAlumnos();
        
        //for (Alumno al : listaDeAlumnos) {
        //    System.out.println("El alumno es: " + al.toString());
        //}
        
        // CREAMOS LISTA DE MATERIAS VACIA Y SE ASOCIA LA CARRERA
        // Porque si se realiza despues las materias no van a tener el codigo de relacion con las carreras en BD
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
         // CREAR CARRERA CON LISTA DE MATERIAS
        Carrera carre = new Carrera(25, "Electronica", listaMaterias);
        
        // GUARDAR CREACIO DE CARRERA EN BD
        control.crearCarrera(carre);
        
        // CREAR MATERIA Y SE GUARDAN EN BD, PERO SEGUIRAN SIN ASOCIARSE A LA CARRERA
        Materia mate1 = new Materia(58, "Programación Básica", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Bases de datos", "Bimestral", carre);
        Materia mate3 = new Materia(60, "Algoritmos Básica", "Anual", carre);
        
        // GUARDAR MATERIAS EN BD
        control.crearMateria(mate3);
        control.crearMateria(mate2);
        control.crearMateria(mate1);
        
        // AGREGAR A LISTA LAS MATERIAS        
        listaMaterias.add(mate3);
        listaMaterias.add(mate2);
        listaMaterias.add(mate1);
        
        // A NIVEL LOGICO AGREGARMOS LISTA MATERIAS A LA CARRERA
        carre.setListaMaterias(listaMaterias);
        
        // A NIVEL BD AGREGAR LISTAS DE MATERIAS A CARRERA
        control.editarCarrera(carre);
        
        
        // CREACION alumno con carrera
        Alumno al = new Alumno(23, "Ibra", "The Yokie", new Date(), carre);
        
        // GUARDAR el alumno en BD
        control.crearAlumno(al);
        
        // VER resultado
        System.out.println("---------------------------");
        System.out.println("------ DATOS ALUMNO -------");
        
        Alumno alu = control.traerAlumno(23);
        
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
        
    }
}
