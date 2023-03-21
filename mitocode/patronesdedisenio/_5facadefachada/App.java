package com.mitocode.patronesdedisenio._5facadefachada;

import com.mitocode.patronesdedisenio._5facadefachada.facade.CheckFacade;

/**
 * Facade es un pátron estructural cuyo objetivo es ocultar o simplificar la complejida que pueda tener nuestra app
 * para que el cliente simplemente tenga un punto de acceso muy fácil y poder utilizar el sistemas sin que el sepa
 * que es lo que hay por dentro
 *
 * En este ejemplo es con la reserva de un vuelo o algun hotel, entonces tendremos una clases representativa como son
 * AvionAPI y HotelAPI por medio de estas en un medio real puden hacer llamadas de un servicio web o alguna bd de acuerdo
 * a los parametros establecidos
 */
public class App {

	/**
	 * Cliente 1 instancia la fachada y mediante el metodo definido en la fechada puede pasar los valores necesarios
	 * para que cada clase haga su trabajo
	 *
	 * Por lo tanto la utilidad de este patrón es que el cliente al utilizar directamente la fachada no tiene porque
	 * saber cual es la complejida que hay en el método buscar
	 *
	 * Y esto en sistemas reales es ampliamente utilizado porque es muy común exponer lógica de negocio en servicios
	 * SOAP o REST atravez de algunas interfaces y que el cliente tome esto como una fachada  para que pueda entrar
	 * a otros subsistemas
	 *
	 * Tambien en las capas de nuestro proyecto poder simplificar la logica de acceso a otras mediante una fachada
	 */
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Canc�n");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
	}

}
