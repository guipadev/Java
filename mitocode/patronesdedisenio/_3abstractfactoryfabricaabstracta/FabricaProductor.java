package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta;


import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.FabricaAbstracta;

public class FabricaProductor {

	public static FabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica();

		} else if (tipoFabrica.equalsIgnoreCase("REST")) {
			return new ConexionRESTFabrica();
		}

		return null;
	}

}
