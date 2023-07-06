package com.charlycimino.prueba.ejSOLID;


/**
 * Principio de Inversión de Dependencia (DIP)
 * mediante el uso de la interfaz Persistencia para desacoplar
 * las clases BaseDatosPersistencia y ArchivoPersistencia de la clase Deportes
 */
public interface Persistencia {
    void guardarDeporte(Deportes deporte);
}