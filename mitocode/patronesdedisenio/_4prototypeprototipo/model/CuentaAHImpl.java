package com.mitocode.patronesdedisenio._4prototypeprototipo.model;

import com.mitocode.patronesdedisenio._4prototypeprototipo.inter.ICuenta;

/**
 * Al momento de implementar ICuenta se tiene que sobreescribir el método clonar()
 */
public class CuentaAHImpl implements ICuenta {

	private String tipo;
	private double monto;

	public CuentaAHImpl() {
		tipo = "AHORRO";
	}

	/**
	 * Sobreescribir el método de clonación
	 */
	@Override
	public ICuenta clonar() {
		//Declaramos una var tipo cuenta del mismo tipo
		CuentaAHImpl cuenta = null;

		try { //Se llama al método clone() que es propio de Java para realizar la clonación del objeto y tenerlo en dicha var
			cuenta = (CuentaAHImpl) clone();
		} catch (CloneNotSupportedException e) { //Si la clonación no es aceptada, lanzara la excepción
			e.printStackTrace();
		}
		//Por último retornamos la instancia clonada
		return cuenta;
	}

	@Override
	public String toString() {
		return "CuentaAHImpl [tipo=" + tipo + ", monto=" + monto + "]";
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}

}
