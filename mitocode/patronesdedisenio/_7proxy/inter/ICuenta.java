package com.mitocode.patronesdedisenio._7proxy.inter;

import com.mitocode.patronesdedisenio._7proxy.model.Cuenta;

public interface ICuenta {

	Cuenta retirarDinero(Cuenta cuenta, double monto);
	Cuenta depositarDinero(Cuenta cuenta, double monto);
	void mostrarSaldo(Cuenta cuenta);
}
