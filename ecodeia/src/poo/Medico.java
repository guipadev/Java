package poo;

public class Medico extends Empleado {
	
	private String especialidad = "";

	public Medico(char sexo, int edad, String raza, String nombre, String dpto, double sueldoBase, String especialidad) {
		super(sexo, edad, raza, nombre, dpto, sueldoBase);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	/**
	 * Uso heredado del método
	 */
	public double calcularSueldo() {
		return super.calcularSueldo() + 100;
	}

}
