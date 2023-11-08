package co.luigicode.patronescomportamiento.state;

public class Fallido implements MisionEstado {
    @Override
    public void siguiente(Mision mision) {
        mision.setEstado(new Progreso());
    }

    @Override
    public String imprimir() {
        return " estado fallido";
    }
}
