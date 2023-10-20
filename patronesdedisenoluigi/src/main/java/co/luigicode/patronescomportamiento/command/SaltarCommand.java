package co.luigicode.patronescomportamiento.command;

public class SaltarCommand implements Command {

    private Player player;

    public SaltarCommand(Player player) {
        this.player = player;
    }

    @Override
    public void ejecutar() {
        player.saltar();
    }

}
