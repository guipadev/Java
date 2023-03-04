package com.pildo._20programaciongenericaArrayList;

import java.io.File;

public class EjeCreacionClaseArrayList {

	public static void main(String[] args) {
		
		
		ArrayList archivos = new ArrayList(4);
		
		
		archivos.add("Juan");
		archivos.add("Jose");
		archivos.add("Jaime");
		archivos.add("Jairo");
		//No nos marca error en tiempo compilacion
		//archivos.add(new File("rutaarchivo.scs")); // Genera el error tiempo de ejecucion
		
		//Nos obliga a convertir
		String nombrePersona = (String) archivos.get(2);
		
		
		//Ejemplo si ahora quisieramos que recibiera tipo File
		//archivos.add(new File("getionPedidos.acs"));
		//File nombrePersona = (File) archivos.get(0);
		
		
		System.out.println(nombrePersona);
	}

}

//Ejemplo creación ArrayList para que maneje cualquier tipo de objeto sin programación generica
class ArrayList {
	private int i = 0;
	private Object[] datosElemento;
	
	public ArrayList(int z) {
		datosElemento = new Object[z];
	}
	
	public Object get(int i) {
		return datosElemento[i];
	}
	
	public void add(Object o) {
		datosElemento[i] = o;
		i++;
	}
}