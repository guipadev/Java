package co.luigicode.patronesestructurales.facade;

public class Forja implements Herreria {

    public static final String ACCION = "hacer";

    @Override
    public void trabajar(String nombre) {
        System.out.println("Vamos " + ACCION + " la " + nombre + "...");
    }
    @Override
    public boolean buscar(String nombre) {
        return Inventario.buscar(nombre, true);
    }

    @Override
    public void remove(String nombre) {
        Inventario.remover(nombre, true);
    }

    @Override
    public void trabajando(String nombre) {
        System.out.println("Haciendo " + nombre);
    }
}
