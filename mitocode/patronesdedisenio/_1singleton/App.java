package com.mitocode.patronesdedisenio._1singleton;


import com.mitocode.patronesdedisenio._1singleton.model.Conexion;

/**
 * Siempre es importante tener un buen control de las instancias que estamos utilizando en el proyecto
 * pero podemos limitar a una única instancia en toda la aplicación a cierto objetos de nuestro proyecto
 * osea que todos los usuarios utilicen esta misma instancia
 *
 * Escenario:
 * Imaginemos que tenemos una lista de paises a mostrar, la probabilidad de que cambien los nombre es casi nula
 * entonces no tendria sentido devolverle a cada usuario que se logue en nuestro sistema un espacio en memoria
 * es decir un objeto el cual tenga ahí la lista de países, porque con 100K usuarios = 100K objetos que utilizan
 * la misma información, por lo cual no tendria sentido
 *
 * Por eso es mejor tener un único objeto el cual sea instanciado una única vez, por cada usuario que necesita esta
 * información, simplemente pide el objeto que tal vez ya alla sido instanciado por otro usuario obtenga la misma información
 * entonces 100K usuario utilizarian el mismo objeto y esto en performance consumo de memorira mucho mejor
 *
 *
 * La desventaja es que no podemos abusar de el, ya que hay momentos donde se requiere que alguna instancia nueva
 * para poder distinguir la operación del usuario A con e usuario B puede variar en algunos valores
 */
public class App {

	public static void main(String[] args) {
		//Instanciaci�n por constructor proh�bido por ser "private"
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();

		//Si el constructor fuera publico se podria esta instanciando la conexion por cada usuario e iria creciendo
		//Conexion c1 = new Conexion();
		//c1.conectar();
		//c1.desconectar();

		// validando realmente es un objeto de la clase conexión
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
	
	//Otro ejemplo en: https://www.youtube.com/watch?v=qiFeiYLzIH8
	//Spring Framework gestiona sus beans como Singleton por defecto
}
