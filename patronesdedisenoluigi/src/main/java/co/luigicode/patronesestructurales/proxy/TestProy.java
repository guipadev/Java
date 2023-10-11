package co.luigicode.patronesestructurales.proxy;

public class TestProy {

    public static void main(String[] args) {
        JuegoImpl juego = new JuegoImpl();
        juego.nuevoJuego("Player1");
        ProxyJuegoImpl proxyJuego = new ProxyJuegoImpl(juego);
        proxyJuego.load("Player1");
        System.out.println(proxyJuego.getEstados());

        proxyJuego.getEstados().setFallecido(10);
        proxyJuego.getEstados().setMuertes(2);
        proxyJuego.getEstados().setNivel(10);
        proxyJuego.save("Player1");
        proxyJuego.load("Player1");
        System.out.println(proxyJuego.getEstados());
    }
}
