package co.luigicode.patronescomportamiento.command;

public class MoverFrenteCommand implements Command {

    private Player player;

    public MoverFrenteCommand(Player player) {
        this.player = player;
    }

    @Override
    public void ejecutar() {
        player.moverAlFrente();
    }
}
