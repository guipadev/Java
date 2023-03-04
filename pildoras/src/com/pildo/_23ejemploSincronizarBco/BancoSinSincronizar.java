package com.pildo._23ejemploSincronizarBco;

/*
Creación de un Banco
Se crearan 100 cuentas, y se cargara c/u con deposito inicial de 2000
Tambien se pueden hacer transferencia entre cuentas, mediante hilos
*/

/*
 Uso sychronize para un cierre implicito, una sola condición
 Para un cierre explicito, varias condiciones debemos realizarlo forma manual
 */
public class BancoSinSincronizar {

	public static void main(String[] args) {
		
		Banco nubank = new Banco();
		
		for (int cta = 0; cta < 100; cta++) {
			EjecucionTransferencias runHilo = new EjecucionTransferencias(nubank, cta, 2000);
		
			Thread hilillo = new Thread(runHilo);
			
			hilillo.start();
		}
	}

}
