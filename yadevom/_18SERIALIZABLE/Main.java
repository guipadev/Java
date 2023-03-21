package serializable;

/*
SERALIZACION: La conversion de un objeto un flujo de bytes

DESERIALIZACION: La atencion de esos bytes y transformarlos a un objeto

Esto lo podemos utilizar a la hora de guardar los objeto en la BD, en un fichero
o incluso transferido a traves de una red
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // SERIALIZADO
        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Juancho");

        FileOutputStream fileOutputStream = new FileOutputStream("fichero.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(persona);
        objectOutputStream.close();

        System.out.println("Se crea el archivo fichero.txt");

        // DESERIALIZADO (Obtener la informacion)
        FileInputStream fileInputStream = new FileInputStream("fichero.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Persona personaEnFichero = (Persona) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(personaEnFichero);

        // Otras clases para serializar
        // new ByteArrayInputStream();
        // new FileOutputStream();
        // new FilterOutputStream();
        // new ObjectOutputStream();
        // new PipedOutputStream();

        // Otras clases para deserializar
        // new AudioInputStream();
        // new ByteArrayInputStream();
        // new FileInputStream();
        // new FilterInputStream();
        // new ObjectInputStream();
        // new PipedOutputStream();
        // new SequenceInputStream();

    }
}
