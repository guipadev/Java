package co.luigicode.patronesestructurales.proxy;

import java.io.*;
import java.util.Date;

/**
 * Clase que implementa interfaz juego
 * esta clase accede al disco duro, escribe y lee los archivos
 * El archivo lo que hacce es almacenar un objeto binario de la clase Estado
 */
public class JuegoImpl implements Juego {

    private Estados estados;

    public Estados getEstados() {
        return estados;
    }

    public JuegoImpl setEstados(Estados estados) {
        this.estados = estados;
        return this;
    }

    @Override
    public void save(String name) {
        try {
            escribirObjeto(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Estados load(String name) {
        Estados estados = null;
        try {
            estados = (Estados) leerObjeto(name);
            setEstados(estados);
            return estados;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Nueva partida de juego
     */
    public void nuevoJuego(String nombre) {
        File file = new File(nombre);
        Estados estados = new Estados(nombre, 1, 0, 0);
        estados.setCreacionPartida(new Date());
        estados.setUltimoGuardado(new Date());
        setEstados(estados);
        try {
            file.createNewFile();
            escribirObjeto(nombre);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Estos metodos privados son los que va utilizar el FileInputStream y outputStream
     */
    private void escribirObjeto(String nombre) throws IOException {
        FileOutputStream fos = new FileOutputStream(nombre);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(getEstados());
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    private Object leerObjeto(String nombre) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(nombre);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object estados = ois.readObject();
        ois.close();
        fis.close();
        return estados;
    }
}
