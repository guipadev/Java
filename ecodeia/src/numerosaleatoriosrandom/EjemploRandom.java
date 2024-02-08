package numerosaleatoriosrandom;

import java.util.Random;

public class EjemploRandom {

	public static void main(String[] args) {
		
		System.out.println("** Método Random de la clase Math **");
		
		for(int x=0; x<5; x++) {
			int num = (int) (Math.random() * 10);
			System.out.print(num + "_");
		}
		
		System.out.println("** Prueba con la clase Math **");
		
		Random ran = new Random();
		
		for(int x=0; x<5; x++) {
			System.out.print(ran.nextInt(10) + "_");
		}
		
		System.out.println("** Al tener la semilla asignada obtendremos el mismo número **");
		
		Random rana = new Random();
		
		rana.setSeed(125);
		
		for(int x=0; x<5; x++) {
			System.out.print(rana.nextInt(10) + "_");
		}
		

	}

}
