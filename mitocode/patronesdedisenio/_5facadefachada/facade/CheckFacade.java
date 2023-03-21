package com.mitocode.patronesdedisenio._5facadefachada.facade;

import com.mitocode.patronesdedisenio._5facadefachada.api.AvionAPI;
import com.mitocode.patronesdedisenio._5facadefachada.api.HotelAPI;

/**
 * Clase fachada que llama a las dos clases que simulan las API
 * Y luego por un método en el cual recibe por parametro todos los valores importantes
 * para que puedan ser buscados en cada clase, que seria en la clase main = App
 */
public class CheckFacade {

	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;
	
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}		
}
