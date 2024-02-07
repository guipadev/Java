package core.usecases;

import java.util.List;

import core.entities.Torneo;
import core.ports.input.IBuscarTorneosUseCase;
import core.ports.output.ITorneoRepository;

/**
 * Capa Core: Casos de uso
 * Para buscar por Id o Todos
 * podrían ir separados en dos clases diferentes, pero en principio se dejo así
 */
public class BuscarTorneosUseCase implements IBuscarTorneosUseCase{

	/**
	 * Los casos de uso, tienen los datos del repositorio, pero esos son detalles
	 * de dónde vengan no es problema del modelo
	 */
	private final ITorneoRepository torneoRepository;
	
	public BuscarTorneosUseCase(ITorneoRepository torneoRepository) {
		this.torneoRepository = torneoRepository;
	}

	@Override
	public Torneo buscarPorId(int id) {
		return torneoRepository.buscarPorId(id);
	}
	
	@Override
	public List<Torneo> buscarTodos() {
		return torneoRepository.buscarTodos();
	}
	
}
