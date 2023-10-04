package co.luigicode.patronesestructurales.facade;

public class BancoTrabajo implements Herreria {

    public static final String ACCION = "mejora";

    @Override
    public void trabajar(String nombre) {
        System.out.println("Hagamos la " + ACCION + " de " + nombre + "...");
    }
    @Override
    public boolean buscar(String nombre) {
        return Inventario.buscar(nombre, false);
    }

    @Override
    public void remove(String nombre) {
        Inventario.remover(nombre, false);
    }

    @Override
    public void trabajando(String nombre) {
        System.out.println("Mejorar " + nombre);
    }
}
