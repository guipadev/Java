package co.luigicode.patronescomportamiento.command;

import java.util.HashMap;

/**
 * El jefaso
 * Es el que guarda todos los comandos en una estructura de datos
 * Y los invoca
 */
public class InvocarMover {

    private HashMap<Character, Command> commands = new HashMap<>();

    private Player player;

    public InvocarMover(Player player) {
        this.player = player;
        commands.put('w', new MoverFrenteCommand(player));
        commands.put('s', new MoverAtrasCommand(player));
        commands.put('d', new MoverDerechaCommand(player));
        commands.put('a', new MoverIzquierdaCommand(player));
        commands.put('j', new SaltarCommand(player));
    }

    public void mover(char c) {
        if (!commands.containsKey(c))
            System.out.println("Comando no existe!!");
        else
            commands.get(c).ejecutar();
    }
}
