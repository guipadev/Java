package co.yom.automovil.persistencia;

import co.yom.automovil.logica.Automovil;
import java.util.List;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
            
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        
    }
    
}
