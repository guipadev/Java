package adapter.view.console;

import java.util.List;

import core.entities.Torneo;
import core.ports.input.IBuscarTorneosUseCase;
import core.ports.input.ICrearTorneoUseCase;

/**
 * Capa Adapter
 * MVC
 * Controlador
 * MenuConsola actúa como controlador 
 * El modelo es lo que viene del Core
 * Accede a los casos de uso mediante los puertos (las interfaces)
 * Y muestra los resultados por consola
 * Aquí tambien se podria usar algo que dice la arquitectura limpia
 * Un Presenter que lo use directamente el caso de uso para mostrar los resultados
 * Consola implementaria esta interfaz presenter
 */
public class MenuConsola {
	private final Consola consola;
	private final IBuscarTorneosUseCase buscarTorneoUseCase;
	private final ICrearTorneoUseCase crearTorneoUseCase;
	

	public MenuConsola(Consola consola, IBuscarTorneosUseCase buscarTorneoUseCase,  ICrearTorneoUseCase crearTorneoUseCase) {
		this.consola = consola;
		this.buscarTorneoUseCase = buscarTorneoUseCase;
		this.crearTorneoUseCase = crearTorneoUseCase;
	}

	public void iniciar() {
		int opcion;
		do {
			consola.mostrarMenu();
			opcion = consola.leerOpcion();
			switch (opcion) {
			case 1:
				verTorneos();
				break;
			case 2:
				buscarTorneo();
				break;
			case 3:
				crearTorneo();
				break;
			case 4:
				consola.mostrarMensaje("Saliendo del programa...");
				break;
			default:
				consola.mostrarMensaje("Opción no válida. Intente de nuevo.");
			}
		} while (opcion != 4);
	}

	private void verTorneos() {
		List<Torneo> torneos = buscarTorneoUseCase.buscarTodos();
		for (Torneo torneo : torneos) {
			consola.mostrarMensaje("ID: " + torneo.getId() + ", Nombre: " + torneo.getNombre());
		}
	}

	private void buscarTorneo() {
		int id = consola.leerEntero("Ingrese el ID del torneo: ");
		Torneo torneo = buscarTorneoUseCase.buscarPorId(id);
		if (torneo != null) {
			consola.mostrarMensaje("Torneo encontrado - ID: " + torneo.getId() + ", Nombre: " + torneo.getNombre());
		} else {
			consola.mostrarMensaje("Torneo no encontrado.");
		}
	}

	private void crearTorneo() {
		String nombre = consola.leerTexto("Ingrese el nombre del torneo: ");
		Torneo torneo = crearTorneoUseCase.crearTorneo(nombre);
		consola.mostrarMensaje("Torneo creado - ID: " + torneo.getId() + ", Nombre: " + torneo.getNombre());
	}
}
