package Absolute.POO.ejemplo;

public class Personaje {

    private String nombre;
    private int edad;
    private String textura;

    /**
     * Como se trata de mostrar datos, por lo cual no debemos llenar var
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Al invocar este metodo nos muestra el parametro nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public void saludar() {
        System.out.println("Hola!!!");
    }


}
