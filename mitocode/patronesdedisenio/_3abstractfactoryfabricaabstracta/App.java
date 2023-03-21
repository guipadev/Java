package com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta;


import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.FabricaAbstracta;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionBD;
import com.mitocode.patronesdedisenio._3abstractfactoryfabricaabstracta.inter.IConexionREST;

/**
 * El patrón abstract factory viene a decir que tienes una super fábrica o una fábrica de fábricas es decir
 * si tú necesitas ahora un objeto, tienes que indicar primero que fábrica va a producir primer este objeto
 * y luego ya puedes tener la instancia del objeto que tu deses
 */
public class App {

	/**
	 * Indicamos que fábrica primero necesitamos utilizar, que en este caso es la fábrica de BD
	 * Pero sin embargo una vez se tenga esta fábrica instanciada se debe indicar que producto se necesita
	 * de dicha fábrica y en base a eso se retorna el objeto indicado y luego podiendo utilizar los métodos
	 * propios de dicha instancia
	 *
	 * Lo mismo si yo quisiera la otra familia de fábrica en lo cual se utiliza la fabrica abstracta e indicamos
	 * la familiar correspondiente que para este caso seria REST
	 */
	public static void main(String[] args) {
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
	}

}
