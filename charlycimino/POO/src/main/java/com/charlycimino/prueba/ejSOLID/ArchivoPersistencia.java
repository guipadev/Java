package com.charlycimino.prueba.ejSOLID;

public class ArchivoPersistencia implements Persistencia {
    @Override
    public void guardarDeporte(Deportes deporte) {
        // Lógica para guardar en un archivo
        // Por ejemplo, aquí se podría escribir los datos del deporte en un archivo de texto
        // o en un formato específico para el almacenamiento
        System.out.println("Guardando el deporte en un archivo: " + deporte.getNombre());
    }
}