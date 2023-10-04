package co.luigicode.patronesestructurales.facade;

public class FacadeHerreria {

    /**
     * El método llama a todos métodos que tengamos por ahí como BancoTrabjo, Forja
     * Y tambien a mayores como Invetario, Herreria y Recetas
     * @param nombre
     * @param hacer
     */
    public void trabajo(String nombre, boolean hacer) {

        if (hacer) {
            Forja forja = new Forja();
            forja.trabajar(nombre);

            if (Recetas.getRecetas(nombre, hacer)) {
                if (!forja.buscar(nombre))
                    return;
                forja.remove(nombre);
                forja.trabajando(nombre);
                System.out.println("El " + nombre + " ha sido creado!!");
            } else {
                System.out.println("No ha sido posible " + forja.ACCION + " la " + nombre);
            }
        } else {
            BancoTrabajo bancoTrabajo = new BancoTrabajo();
            bancoTrabajo.trabajar(nombre);

            if (Recetas.getRecetas(nombre, hacer)) {
                if (!bancoTrabajo.buscar(nombre))
                    return;
                bancoTrabajo.remove(nombre);
                bancoTrabajo.trabajando(nombre);
                System.out.println("El " + nombre + " ha sido mejorada!!");
            } else {
                System.out.println("No ha sido posible " + bancoTrabajo.ACCION + " la " + nombre);
            }
        }
    }
}
