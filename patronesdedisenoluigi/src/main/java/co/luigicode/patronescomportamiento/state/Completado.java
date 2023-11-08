package co.luigicode.patronescomportamiento.state;

public class Completado implements MisionEstado {
    @Override
    public void siguiente(Mision mision) {
        System.out.println(mision.getNombre() + " mision completada, no tiene siguiente estado");
    }

    @Override
    public String imprimir() {
        return " estado completado";
    }
}
