package com.mitocode.patronesdedisenio._7proxy;


import com.mitocode.patronesdedisenio._7proxy.inter.ICuenta;
import com.mitocode.patronesdedisenio._7proxy.inter.impl.CuentaBancoBImpl;
import com.mitocode.patronesdedisenio._7proxy.model.Cuenta;
import com.mitocode.patronesdedisenio._7proxy.proxy.CuentaProxy;

/**
 * Proxy pátron de diseño estructural, es tener un envoltorio que permita tener el acceso al objeto real
 * o al objeto final que nosotros necesitamos manipular, de acuerdo unos puntos como:
 * - Encapsular la complejida del objetivo en un envoltorio osea en una clase intermediaria
 * - El cliente va interactuar con este intermediario/envoltorio para que este envoltorio delege informacion o rol
 * Si quieres la flexibidad de poder cambiar alguna implementación en particular, básicamente se puede apoyar en una interfaz
 *
 * EJEMPLO:
 * Se tiene una cuenta bancarario con X valor inicialmente, vamos hacer 3 operaciones, retirar, depositar y mostrar saldo
 *
 * VENTAJA?
 * Quiza nos preguntemos que ventaja tendria agregar una clase adicional simplemente para delegar el proceso
 * hacia la clase final
 * Pues imaginemos que necesitemos llevar una información o un log de lo que se hace en cada proceso
 * Digamos que el objetivo del requerimiento es no alterar la estructura base de la clase
 * porque puede tener una lógica asociada y se puede reutilizar para otras cosas
 * Entonces la clase proxy seria idonea para agregar esa pequeña funcionalidad extra en este ejemplo de los logs
 *
 * Si en algun momento nos dicen que no vamos a seguir trabajando con la CuentaBancoA si no con la CuentaBancoB
 * El proyecto no se vera afectado por dicho cambio ya que mediante la intefaz se da esa flexibidad de cambiar
 * de la implementacion A a la B y el resultado se dara a la nueva implementación
 */
public class App {

	public static void main(String[] args) {
		// Se crea una cta. X
		Cuenta c = new Cuenta(1, "mitocode", 100);

		// Se crea una instancia del proxy
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());

		/**
		 * Con el proxy se accede a las operaciones que queremos realizar
		 * Siendo este el intermediario por nosotros y nos permita operar con los metodos
		 * definidos en la clase implementación
		 */
		cuentaProxy.mostrarSaldo(c);

		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}

}
