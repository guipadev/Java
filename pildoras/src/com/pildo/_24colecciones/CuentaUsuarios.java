package com.pildo._24colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentaUsuarios {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cliente2 = new Cliente("Rafael Nadal", "00002", 280000);
		Cliente cliente3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cliente4 = new Cliente("Julio Iglesias", "00004", 500000);
		Cliente cliente5 = new Cliente("Julio Iglesias", "00004", 500000);
	
		/*
		 Validación de colección a utilizar:
		 1. Repetir cliente No?
		 2. Agregar o borrar?
		 3. Solo lectura?
		 */
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cliente1);
		clientesBanco.add(cliente2);
		clientesBanco.add(cliente3);
		clientesBanco.add(cliente4);
		clientesBanco.add(cliente5);
		
		// Eliminacion de un cliente no se puede realizar con foreach
		/*
		for (ClienteChat cliente : clientesBanco) {
			if (cliente.getNombre().equals("Julio Iglesias")) {
				clientesBanco.remove(cliente);
			}
		}
		*/
		
		// La eliminación debe realizarse con Iterador
		Iterator<Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombreCliente = it.next().getNombre();
			
			if (nombreCliente.equals("Julio Iglesias")) {
				it.remove();
			}
		}
		
		// Recorrido clientes
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getNumCuenta() + " " + cliente.getSaldo());
		}
		
		System.out.println("------------ RECORRIDO CON ITERADOR ------------");
		
		// Uso de iterador
		// Iterator<ClienteChat> it = clientesBanco.iterator();
		
		// Mientras hay elementos por recorrer
		/*
		while(it.hasNext()) {
			
			String nombreCliente = it.next().getNombre(); // next salta una posición
		
			System.out.println(nombreCliente);
		}
		*/
	}

}
