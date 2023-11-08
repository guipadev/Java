package co.luigicode.patronescomportamiento.state;

public class Progreso implements MisionEstado {
    @Override
    public void siguiente(Mision mision) {
        if (Math.random() < 0.5)
            mision.setEstado(new Completado());
        else
            mision.setEstado(new Fallido());
    }

    @Override
    public String imprimir() {
        return " estado en progreso";
    }
}
