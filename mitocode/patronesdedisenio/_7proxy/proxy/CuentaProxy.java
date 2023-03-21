package com.mitocode.patronesdedisenio._7proxy.proxy;

import com.mitocode.patronesdedisenio._7proxy.inter.ICuenta;
import com.mitocode.patronesdedisenio._7proxy.inter.impl.CuentaBancoAImpl;
import com.mitocode.patronesdedisenio._7proxy.model.Cuenta;

import java.util.logging.Logger;

/**
 * Se implementa la interfaz ICuenta ya que el objetivo es poder manipular el objeto real y poder hacer
 * algo con esas operaciones definidas
 */
public class CuentaProxy implements ICuenta {

	// Se declara la referencia a una implementación en particular para sobreescribir los métodos
	private ICuenta cuentaReal;
	private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());

	public CuentaProxy(ICuenta cuentaReal) {
		this.cuentaReal = cuentaReal;
	}

	/**
	 * Validamos si 1ero existe una instancia de la var inicial
	 * si existe trabajo con ella
	 * si no existe hago una instancia opero con ella
	 * Esto obedece al principio que vamos a tener un intermediario para una llamada remota o costosa
	 * Ya que si estuvieramos instanciando cada vez el objeto seria perjudicial para el rendimiento de la App
	 * por lo cual se comprueba para estar reutilizandolo, claro esto es opcional depende del dev
	 *
	 * Lo importante de este patron es que se encapsula la logica y que el cliente utilice el proxy
	 * antes del objeto final, el cliente debe utilizar el proxy intermediario para llegar al objeto final
	 *
	 * Por eso aquí se usa un intermediario y nos apoyamos en el método retirar dinero, pasandole el monnto cuenta
	 * y haces sus operaciones, lo mismo para depositor y mostrar saldo
	 */
	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.retirarDinero(cuenta, monto);
		} else {
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.depositarDinero(cuenta, monto);
		} else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			cuentaReal.mostrarSaldo(cuenta);
		} else {
			cuentaReal.mostrarSaldo(cuenta);
		}
	}

}
