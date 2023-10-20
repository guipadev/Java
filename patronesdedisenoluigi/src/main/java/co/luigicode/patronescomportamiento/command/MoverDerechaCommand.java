package co.luigicode.patronescomportamiento.command;

public class MoverDerechaCommand implements Command {

    private Player player;

    public MoverDerechaCommand(Player player) {
        this.player = player;
    }

    @Override
    public void ejecutar() {
        player.moverAlaDerecha();
    }
}
