package com.mitocode.patronesdedisenio._2factoryfabrica;


import com.mitocode.patronesdedisenio._2factoryfabrica.inter.IConexion;

/**
 * El objetivo del patrón Fábrica es devolver instancias de una clase particular por medio de un identificador
 * Por ejemplo si necesito la instancia de una clase persona
 * Yo le voy a decir a la fábrica, necesito un objeto de la clase persona
 * Si necesito un objeto de la clase boleta, entonces primero debo ir por la fábrica
 * Y la fábrica va ser la responsable de devolverme esa instancia
 * Yo no voy a instanciar directamente el objeto
 *
 * BENEFICIO
 * La flexibidad que nos proporciona el código al no depender de una instancia en particular
 * ya que primero tendremos que pasar por la fábrica y la fábrica nos da la implementación que necesitamos
 * y así podremos cambiar una pieza por otra, según el contexot de la aplicación
 */
public class App {

	public static void main(String[] args) {
		//Entro a un concepto llamado fábrica y vamos a tenemos una conexión en base a algún identificador
		//esto devuelve una instancia, y así ya se puede disponer de los metodos propios de esa instancia
		ConexionFabrica fabrica = new ConexionFabrica();

		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		IConexion cx3 = fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
	}
}
