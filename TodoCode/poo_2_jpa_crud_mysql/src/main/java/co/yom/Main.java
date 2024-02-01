package co.yom;

import co.yom.logica.Alumno;
import co.yom.logica.Carrera;
import co.yom.logica.Controladora;
import co.yom.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    // Se creara en BD tabla alumno y sequence(cuenta la frecuencia ID que se va creando) 
    public static void main(String[] args) {

        /**
         * Llamamos la controladora persitencia directamente desde el main
         * porque todavia no teniamos la controladora de logica
         */
        //ControladoraPersistencia control = new ControladoraPersistencia();
        /**
         * ControladoraLogica llamara a ControladoraPersistencia, cumpliendo el
         * modelo de capas Realizaremos el proceso creacion usuario con datos
         * quemados, porque esta informacion la recibiremos normalmente del
         * frotend y recibira en la controladora de la logica y no aquí en main
         */
        Controladora control = new Controladora();
        
        // Crear Alumno
        /*
        Alumno alu = new Alumno(22, "Omar", "Geles", new Date());
        control.crearAlumno(alu);
        */
        
        // Editar Alumno
        /*
        alu.setApellido("De Paul");
        control.editarAlumno(alu);
        */
        
        // Eliminar alumno por el Id
        //control.eliminarAlumno(2);
        
        // Recibimos en un variable datos de un alumno
        /*
        Alumno alu = control.traerAlumno(22);
        System.out.println("---------- BUSQUEDA INDIVIDUAL ----------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("---------- BUSQUEDA DE TODOS ----------");
        ArrayList<Alumno> listaDeAlumnos = control.traerListaAlumnos();
        
        for (Alumno al : listaDeAlumnos) {
            System.out.println("El alumno es: " + al.toString());
        }
        */
        
        // ORDEN DE CREACION ALUMNO CON CARRERA
        /*
        // Creación Carrera
        Carrera carre = new Carrera(25, "Desarrollo de Software");
        
        // Guardado Carrera en BD
        control.crearCarrera(carre);
        
        // Creación de alumno con carrera 
        Alumno al = new Alumno(23, "Omar", "Geles", new Date(), carre);
        
        // Guardar alumno en BD
        control.crearAlumno(al);
        
        // Ver el resultado
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------DATOS ALUMNO------------------------");
        
        Alumno alu = control.traerAlumno(23);
        
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        */
        
         // Creamos listas de materias
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        // Creación carreara con lista de materias
        Carrera carre = new Carrera(2, "Ingenieria de Software", listaMaterias);
        
        // Guardado Carrera en BD
        control.crearCarrera(carre);
        
        // Creación materias
        // Queda asociado materias a carrera vacias por el momento
        Materia mate1 = new Materia(58, "Programación Básica", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Bases de datos", "Bimestral", carre);
        Materia mate3 = new Materia(60, "Algoritmos Básica", "Anual", carre);
        
        // Guardado materias en BD
        control.crearMateria(mate3);
        control.crearMateria(mate2);
        control.crearMateria(mate1);
        
        // Agregar a la lista de materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        // A nivel logico agregamos la lista de materias a la carrera
        // carre edita la lista y aqui ya se asocia a las carreras las materias
        carre.setListaMaterias(listaMaterias);
        
        // A nivel BD agregamos lista de Materias a la Carrera
        control.editarCarrera(carre);
        
        
        
        // Creación de alumno con carrera 
        Alumno alum = new Alumno(3, "Silvestre", "Dangond", new Date(), carre);
        
        // Guardar alumno en BD
        control.crearAlumno(alum);
        
        // Ver el resultado
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------DATOS ALUMNO------------------------");
        
        Alumno alu = control.traerAlumno(3);
        
        System.out.println("Alumno: " + alum.getNombre() + " " + alum.getApellido());
        System.out.println("Cursa la carrera de: " + alum.getCarre().getNombre());
        
        
        

    }
}
