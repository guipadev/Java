package Colecciones_EstructuraDatos.listaObjetos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> listaDeAlmunos = new ArrayList<>();
        Alumno alu1 = new Alumno("Cristian", 25);
        Alumno alu2 = new Alumno("Jose", 24);

        listaDeAlmunos.add(alu1);
        listaDeAlmunos.add(alu2);

        /***
        for(int i=0; i<listaDeAlmunos.size(); i++){
            System.out.println(listaDeAlmunos.get(i));
            //Otra forma
            //System.out.println(listaDeAlmunos.get(i).toString());
            //Mostrar solo edad
            System.out.println(listaDeAlmunos.get(i).getEdad());
        }
         ***/

        for (Alumno alumno : listaDeAlmunos){
            System.out.println(alumno);
        }
    }
}
