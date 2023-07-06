package com.charlycimino.prueba.ejSOLID;

public class BaseDatosPersistencia implements Persistencia {
    @Override
    public void guardarDeporte(Deportes deporte) {
        // Lógica para guardar en una base de datos
        // Por ejemplo, aquí se podría utilizar una conexión a una base de datos
        // y ejecutar una sentencia SQL para guardar los datos del deporte
        System.out.println("Guardando el deporte en la base de datos: " + deporte.getNombre());
    }
}
