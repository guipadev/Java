package co.luigicode.patronesestructurales.facade;

public interface Inventario {

    static boolean buscar(String nombre, boolean hacer) {
        String accion = hacer ? "Hacer" : "Mejorar";

        if (Math.random() > 0.5) {
            System.out.println("Tienes materiales necesarios para " + accion + " de " + nombre);
            return true;
        } else {
            System.out.println("No posees materiales necesarias para " + accion + " de " + nombre);
            return false;
        }
    }

    static void remover(String nombre, boolean hacer) {
        String accion = hacer ? "Hacer" : "Mejorar";
        System.out.println("Eliminado del inventario los materiales usados para " + accion + " de " + nombre);
    }
}
