package co.luigicode.patronescreacionales.singleton;

public class TestSingleton {

    /**
     * Esto da problemas classloader que es un contenedor, donde se cargan todas las clases
     * que va a utilizar el programa
     * Class Not Exception, indica classloader no encuentra clase que estamos instanciando
     * cada programa tiene su classloader, si tenemos variable tipo singleton no pasa nada
     * porque cada classloader tiene sus variables, pero en los casos que se comparten variables
     * el usar singleto seria complicado, como el el caso de la programación multihilo
     */
    public static void main(String[] args) {

        /*
        Player player = Player.getPlayer("pepe");

        System.out.println(player);

        player = Player.getPlayer("manolo");

        System.out.println(player); // seguri llamandose "pepe"
         */

        // Ejecucion en hilos
        Thread threadPepe = new Thread(new RunPepe());
        Thread threadJuan = new Thread(new RunJuan());

        threadPepe.start();
        threadJuan.start();

    }

    static class RunPepe implements Runnable {
        @Override
        public void run() {
            Player player = Player.getPlayer("pepe");
            System.out.println(player);
        }
    }

    static class RunJuan implements Runnable {
        @Override
        public void run() {
            Player player = Player.getPlayer("juan");
            System.out.println(player);
        }
    }
}
