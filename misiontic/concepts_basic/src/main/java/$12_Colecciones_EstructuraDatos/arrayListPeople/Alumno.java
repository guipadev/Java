package $12_Colecciones_EstructuraDatos.arrayListPeople;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int lu;
    private Date fechaNacimiento;

    public Alumno(String nombre, String apellido, String dni, int edad, int lu, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.lu = lu;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getLu() {
        return lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String formatearFechaDeNacimiento(){
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = fecha.format(fechaNacimiento);
        return fechaFormateada;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}