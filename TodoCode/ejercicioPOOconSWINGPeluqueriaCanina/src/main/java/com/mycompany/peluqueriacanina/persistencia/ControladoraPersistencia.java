package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Dueno dueno, Mascota masco) {
        
        // Primero dueño se creara en BD para asociar luego a la mascota
        duenoJpa.create(dueno);
        
        // Crear en BD la mascota
        mascoJpa.create(masco);
    }
    
    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public Mascota traerMascota(int num_cliente) {
        return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Dueno traerDueno(int id_dueno) {
        
        return duenoJpa.findDueno(id_dueno);
    }

    public void modificarDueno(Dueno dueno) {
    
        try {
            duenoJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
