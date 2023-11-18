package co.luigicode.patronescomportamiento.visitor;

public class Mago implements Visitable {

    private String nombre;

    public Mago(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Mago setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void ataqueElemento() {
        System.out.println(getNombre() + " ataque de elemento!!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitar(this);
    }
}
