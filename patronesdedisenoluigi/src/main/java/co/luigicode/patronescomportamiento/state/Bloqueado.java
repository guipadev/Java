package co.luigicode.patronescomportamiento.state;

public class Bloqueado implements MisionEstado {
    @Override
    public void siguiente(Mision mision) {
        mision.setEstado(new Desbloqueado());
    }

    @Override
    public String imprimir() {
        return " estado bloquedo";
    }
}
