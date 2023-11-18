package co.luigicode.patronescomportamiento.visitor;

public class Guerrero implements Visitable {

    private String nombre;

    public Guerrero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Guerrero setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void ataquePoder() {
        System.out.println(getNombre() + " ataque de poder!!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitar(this);
    }
}
