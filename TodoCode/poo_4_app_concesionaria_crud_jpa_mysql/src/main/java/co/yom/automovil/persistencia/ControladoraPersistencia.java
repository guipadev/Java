package co.yom.automovil.persistencia;

import co.yom.automovil.logica.Automovil;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
            
        autoJpa.create(auto);
    }
    
}
