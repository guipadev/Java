package com.mitocode.patronesdedisenio._5facadefachada.api;

/**
 * Esto similiar a páginas como booking, despegar donde pasamos un dato y busca en muchos establecimientos o en
 * muchos hoteles los datos que sean importante para el usuario final
 * No es que estas páginas tengan acceso a los sistemas de una forma total, lo que tienen es unos servicio expuestos
 * que puedan ser utilizados y enviar esa información al usuario que esta solicitando
 * Por lo tanto estos sistemas serian como una especie de fachada entre la implementación compleja de todos las aerolineas y hoteles
 *
 */
public class AvionAPI {

	public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		System.out.println("==============================");
		System.out.println("Vuelos encontrados para " + destino + " desde " + origen);
		System.out.println("Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta);
		System.out.println("==============================");
	}

}
