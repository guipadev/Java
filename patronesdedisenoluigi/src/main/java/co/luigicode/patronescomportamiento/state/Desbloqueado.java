package co.luigicode.patronescomportamiento.state;

public class Desbloqueado implements MisionEstado {
    @Override
    public void siguiente(Mision mision) {
        mision.setEstado(new Progreso());
    }

    @Override
    public String imprimir() {
        return " estado desbloqueado";
    }
}
