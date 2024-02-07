package core.usecases;

import java.util.UUID;

import core.entities.Torneo;
import core.ports.input.ICrearTorneoUseCase;
import core.ports.output.ITorneoRepository;

/**
 * Capa Core: Casos de uso
 * Para crear el torneo 
 */
public class CrearTorneoUseCase implements ICrearTorneoUseCase {

	/**
	 * Los casos de uso, tienen los datos del repositorio, pero esos son detalles
	 * de dónde vengan no es problema del modelo
	 */
	private final ITorneoRepository torneoRepository;
	
	public CrearTorneoUseCase(ITorneoRepository torneoRepository) {
		this.torneoRepository = torneoRepository;
	}

	@Override
	public Torneo crearTorneo(String nombre) {
		long uuid = UUID.randomUUID().getMostSignificantBits();
		int shortenedInteger = (int) (uuid & 0xFFFFFFFF);
		Torneo t = new Torneo(shortenedInteger, nombre);
		torneoRepository.guardar(t);
		return t;
	}
	
	
}
