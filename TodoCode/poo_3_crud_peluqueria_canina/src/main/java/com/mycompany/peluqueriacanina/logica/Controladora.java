package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String observaciones, String alergico, String atenEsp, 
            String nombreDueno, String celDueno) {
        
        // Creamos el dueño y asignamos sus valores
        Dueno dueno = new Dueno();
        
        dueno.setNombre(nombreDueno);
        dueno.setCelDueno(celDueno);
        
        // Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        
        masco.setUnDueno(dueno);
        
        // Invocar a la persistencia para que estos datos obtenidos los guarde en BD
        controlPersis.guardar(dueno, masco);
    }
    
    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDueno, String celDueno) {

        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        // Modifico los datos de mascota con los valores nuevos
        controlPersis.modificarMascota(masco);
        
        // Seteo nuevos valores del dueño
        Dueno dueno = this.buscarDueno(masco.getUnDueno().getId_dueno());
        dueno.setCelDueno(celDueno);
        dueno.setNombre(nombreDueno);
        
        // Llamar al modificar dueño
        this.modificarDueno(dueno);
        
    }

    private Dueno buscarDueno(int id_dueno) {

        return controlPersis.traerDueno(id_dueno);
    }

    private void modificarDueno(Dueno dueno) {
        
        controlPersis.modificarDueno(dueno);
    }
    
}
