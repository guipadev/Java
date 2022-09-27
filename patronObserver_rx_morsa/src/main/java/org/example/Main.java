package org.example;

/*
Patron Observer con Java Rx

Este patron se utiliza mucho en el frontend
Cada vez que se crea un lisener de un boton o el callback de una promesa que va a llegar de un servidor
por debajo se utiliza el patron observador, este patron se utiliza cuando el programa esta esperando que
suceda algo en especifico

Una practica que se realiza cuando no se conoce este patron:
//Es crear una variable booleana en false y apenas sucediera el evento cambiar el valor de la variable
boolean isReady = false;

//En el programa se lanzaba un proeso asincrono que tomaba un tiempo en realizarse y para saber si esta
//listo o no tenia que chequear constantemente
main () {
    while(time) {
        if (isReady) {
            break;
        }
        println("Proceso terminado");
    }
}

Pero esta forma es muy eneficiente

CON EL PATRON OBSERVER
EL programa hay un evento que esta en proceso y saber cuando se termina o se lance este evento
Para eso creamos un observador que este constantement mirando este evento y nos avise cuando se lance y finaliza

Mientras el observador realiza este proceso, podremos realizar otros proceso en el hilo principal de dicho programa
Asi mismo podemos tener multiples observadores mirando el mismo evento y una vez este finalice envia una notificacion
a cada uno de estos observadores que lo estaba mirando y asi cada uno de estos observadores sigue haciendo tareas
segun lo que tenian programado.

Ejemplo  con observador:

main() {
    proceso = new ProcesoObservador();

    proceso.subscripcion(event -> {
        println("Proceso terminado");
    });

    otrosProcesos();
    sleep();
}

*/
public class Main {

    public static void main(String[] args) {
        String mensaje = "Hola, aprendiendo Observer uwu";

        MiProcesoObservable miProceso = new MiProcesoObservable(mensaje);

        miProceso.subscribe(mensajeRecibido -> {
            System.out.println(mensajeRecibido);
        });

        miProceso.enviarMensaje();

        otrosProcesos();
        System.out.println("Esperando que terminen procesos pendientes");
    }

    private static void otrosProcesos() {
        int a = 0;
        for (int i = 0; i < 100000; i++) {
            a += i;
        }
    }
}