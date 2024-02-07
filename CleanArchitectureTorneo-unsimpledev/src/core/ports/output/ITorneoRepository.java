package core.ports.output;

import java.util.List;

import core.entities.Torneo;

/**
 * Capa core: uso puerto y adaptadores
 * Se usa un puerto que se va implementar en las capas de afuera un adapter
 * Los casos de usos se van a invocar desde afuera
 * La arquitectura limpia plantea que la comunicación entre capas
 * se hace mediante interfaces
 */
public interface ITorneoRepository {

	public Torneo buscarPorId(int id);

	public List<Torneo> buscarTodos();

	public void guardar(Torneo torneo);
	
}
