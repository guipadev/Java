package co.luigicode.patronescomportamiento.visitor;

public class Asesino implements Visitable {

    private String nombre;

    public Asesino(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Asesino setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void ataqueSigilo() {
        System.out.println(getNombre() + " ataque de sigilo!!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitar(this);
    }
}
