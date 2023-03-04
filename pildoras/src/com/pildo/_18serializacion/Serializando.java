package com.pildo._18serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando {
	
	public static void main(String[] args) {
		
		Administrador jefe = new Administrador("Juan", 90000, 2005,12,15);
		
		jefe.setIncentivo(5000);
		
		Empleado[] personal = new Empleado[3];
		
		personal[0] = jefe;
		
		personal[1] = new Empleado("Ana", 25000, 2008,10,1);
		
		personal[2] = new Empleado("Luis", 18000, 2012,9,15);
	
		try {
		
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/empleado_serializado.txt"));
			//Objeto a enviar al exterior
			escribiendoFichero.writeObject(personal);
			
			escribiendoFichero.close();
			
			ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("/home/yamid/Documents/eclipse-workspace/curso_java_pildorasinformaticas/src/empleado_serializado.txt"));

			Empleado[] personalRecuperado = (Empleado[]) recuperandoFichero.readObject();
			
			recuperandoFichero.close();
			
			for(Empleado e : personalRecuperado) {
				System.out.println(e);	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}

class Empleado implements Serializable {
	
	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
	public Empleado(String n, double s, int agno, int mes, int dia) {
		nombre = n;
		sueldo = s;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		fechaContrato = calendario.getTime();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato + "]";
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}	
}

class Administrador extends Empleado {

	private double incentivo;
	
	public Administrador(String n, double s, int agno, int mes, int dia) {
		super(n, s, agno, mes, dia);
		incentivo = 0;
	}

	public double getSueldo() {
		double sueldoBase = super.getSueldo();
		return  sueldoBase + incentivo;
	}

	public void setIncentivo(double b) {
		incentivo = b;
	}

	@Override
	public String toString() {
		return super.toString() + " Incentivo = " + incentivo;
	}
	 
}