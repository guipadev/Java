package co.luigicode.patronescomportamiento.command;

public class MoverIzquierdaCommand implements Command {

    private Player player;

    public MoverIzquierdaCommand(Player player) {
        this.player = player;
    }

    @Override
    public void ejecutar() {
        player.moverAlaDerecha();
    }
}
