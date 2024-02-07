package poo;

public class Empleado extends Persona {

	private String nombre = "";
	private String dpto = "";
	private double sueldoBase = 0;
	
	public Empleado(char sexo, int edad, String raza, String nombre, String dpto, double sueldoBase) {
		super(sexo, edad, raza);
		this.nombre = nombre;
		this.dpto = dpto;
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public double calcularSueldo() {
		return sueldoBase * 1.05;
	}
	
}
