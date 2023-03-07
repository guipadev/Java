package $12_Colecciones_EstructuraDatos.arrayListCoche;

/**
 * Crea un ArrayList de Objetos de tipo Coche.
 * El programa pide por teclado los datos de los coches y los guarda en el array.
 * A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:
 * Todos los coches introducidos.
 * Todos los coches de una marca determinada.
 * Todos los coches con menos de un número determinado de Kilómetros.
 * El coche con mayor número de Kilómetros.
 * Todos los coches ordenados por número de kilómetros de menor a mayor.
 **/

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int Km;

    public int getKm() {
        return Km;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();

        data.append("\nMatrícula: ");
        data.append(matricula);
        data.append("\nMarca: ");
        data.append(marca);
        data.append("\nModelo: ");
        data.append(modelo);
        data.append("\nKm: ");
        data.append(Km);

        return data.toString();
    }
}

