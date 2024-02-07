package adapter.view.console;

import java.util.Scanner;

/**
 * Capa Adapter
 * MVC
 * Vista
 * La vista por consola, usa un diseño MVC
 */
public class Consola {
	private final Scanner scanner;

	public Consola() {
		this.scanner = new Scanner(System.in);
	}

	public void mostrarMenu() {
		System.out.println("---------Menu---------------");
		System.out.println("1. Ver Torneos");
		System.out.println("2. Buscar Torneo");
		System.out.println("3. Crear Torneo");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opción: ");
	}

	public int leerOpcion() {
		return scanner.nextInt();
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	public String leerTexto(String mensaje) {
		System.out.print(mensaje);
		scanner.nextLine(); //Limpia el buffer
		return scanner.nextLine();
	}

	public int leerEntero(String mensaje) {
		System.out.print(mensaje);
		return scanner.nextInt();
	}

	public void cerrar() {
		scanner.close();
	}
}
