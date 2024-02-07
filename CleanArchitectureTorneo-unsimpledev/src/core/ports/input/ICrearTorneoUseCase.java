package core.ports.input;

import core.entities.Torneo;

/**
 * Capa core: Puertos de entrada para cada caso de uso 
 * También dice que los datos que viajan no deben ser las entidades
 * si no DTOs (Data Transfer Object) que aquí no se esta realizando xD
 */
public interface ICrearTorneoUseCase {

	public Torneo crearTorneo(String nombre);
}
