package poo;

public class Persona {

	private char sexo = ' ';
	private int edad = 0;
	private String raza = "";
	
	
	
	public Persona(char sexo, int edad, String raza) {
		this.sexo = sexo;
		this.edad = edad;
		this.raza = raza;
	}

	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
}
