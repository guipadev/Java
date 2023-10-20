package co.luigicode.patronescomportamiento.command;

public class MoverAtrasCommand implements Command {

    private Player player;

    public MoverAtrasCommand(Player player) {
        this.player = player;
    }

    @Override
    public void ejecutar() {
        player.moverAtras();
    }

}
