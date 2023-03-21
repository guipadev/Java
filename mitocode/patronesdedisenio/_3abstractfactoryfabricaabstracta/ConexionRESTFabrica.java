package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta;


import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.FabricaAbstracta;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionBD;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionREST;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl.ConexionRESTCompras;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl.ConexionRESTNoArea;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.impl.ConexionRESTVentas;

/**
 * Para esta clase solo establecemos la definición que el usuario pidio compras
 * por ende devolvemos una instancia de compra y si el usuario pide ventas devolver instancia de venta
 */
public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
