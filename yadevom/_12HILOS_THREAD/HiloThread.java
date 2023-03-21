package com.yadevom._12HILOS_THREAD;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class HiloThread extends Thread {

    @Override
    public void run() {
        try {
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000 + 1);
            System.out.println("Hola soy un hilo de THREAD " + LocalDateTime.now());
            Thread.sleep(randomNum); // 4000
            System.out.println("Hola soy un hilo de THREAD " + LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

