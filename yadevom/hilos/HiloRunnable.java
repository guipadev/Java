package hilos;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class HiloRunnable implements Runnable {

    @Override
    public void run() {
        try {
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000 + 1);
            System.out.println("Hola soy un ejecutable de hilo RUNNABLE" + LocalDateTime.now());
            Thread.sleep(randomNum); // 3000
            System.out.println("Hola soy un ejecutable de hilo RUNNABLE" + LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
