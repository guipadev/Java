package co.luigicode.patronesestructurales.proxy;

import java.util.Date;

public class ProxyJuegoImpl implements Juego {

    private Estados estados;
    private JuegoImpl juegoImpl;

    public ProxyJuegoImpl(JuegoImpl juegoImpl) {
        this.juegoImpl = juegoImpl;
    }

    public Estados getEstados() {
        return estados;
    }

    public ProxyJuegoImpl setEstados(Estados estados) {
        this.estados = estados;
        return this;
    }

    public JuegoImpl getJuegoImpl() {
        return juegoImpl;
    }

    public ProxyJuegoImpl setJuegoImpl(JuegoImpl juegoImpl) {
        this.juegoImpl = juegoImpl;
        return this;
    }

    @Override
    public void save(String name) {
        estados.setUltimoGuardado(new Date());
        juegoImpl.setEstados(estados);
        juegoImpl.save(name);
    }

    @Override
    public Estados load(String name) {
        Estados estados = getJuegoImpl().load(name);
        setEstados(estados);
        return estados;
    }
}
