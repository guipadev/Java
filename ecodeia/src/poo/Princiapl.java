package poo;

public class Princiapl {

	public static void main(String[] args) {
		
		Persona per = new Persona('F', 20, "Negro");
		
		System.out.println("La personas es de raza: " + per.getRaza());
		
		
		Empleado emp = new Empleado('M', 30, "Caucacito", "Pedro", "Contabilidad", 3000000);
		
		System.out.println("El empleado de nombre " + emp.getNombre() + " tiene un sueldo de $" + emp.calcularSueldo() + " y es de raza " + emp.getRaza());
		
		
		Medico med = new Medico('F', 27, "Asiatico", "Ariel", "Administrativo", 3000000, "Cirujano");
		
		System.out.println("El medico de nombre " + med.getNombre() + " tiene un sueldo de $" + med.calcularSueldo() + " y es de raza " + med.getRaza());
		
		
		// Uso persona como medico
		Persona rep = new Medico('M', 29, "Mongol", "Juan", "Administrativo", 6500000, "Cardiologo");
		
		Medico medi = (Medico)rep;
		
		System.out.println("El medico de nombre " + medi.getNombre() + " tiene un sueldo de $" + medi.calcularSueldo() + " y es de raza " + medi.getRaza());
	}
}
