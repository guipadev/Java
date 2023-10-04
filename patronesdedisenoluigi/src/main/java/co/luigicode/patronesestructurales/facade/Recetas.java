package co.luigicode.patronesestructurales.facade;

public interface Recetas {

    static boolean getRecetas(String nombre, boolean hacer) {
        String accion = hacer ? "Hacer" : "Mejorar";

        if (Math.random() > 0.5) {
            System.out.println("Tienes habilidades necesarias para " + accion + " de " + nombre);
            return true;
        } else {
            System.out.println("No posees habilidades necesarias para " + accion + " de " + nombre);
            return false;
        }
    }
}
