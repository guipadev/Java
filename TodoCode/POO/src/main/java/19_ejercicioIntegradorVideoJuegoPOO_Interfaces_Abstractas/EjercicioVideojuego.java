/*
Crear una clase llamada VideoJuego, que tenga los siguientes atributos:
codigo, titulo, consola, cantidadJugadores, categoria(tener en cuenta todos sus 
atributos, constructores, métodos getters y setters).

- Crear una ArrayList de tipo VideoJuego. Crear 5 videojegos y guardarlos en la collection.
- Recorrer la ArrayList creada y mostrar por pantalla el titulo, consola y cantidad de jugadores 
  de los video juegos almacenados.
- Cambiar el nombre y la cantidad de jugadores de dos videojuegos. 
  Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
- Recorrer la ArrayList y mostrar por pantalla únicamente a los videojuegos que sean 
  de la consola "Nintendo 64" 
*/
package ejercicioIntegradorVideoJuegoPOO;

import ejercicioIntegradorVideoJuegoPOO.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;


public class EjercicioVideojuego {

    public static void main(String[] args) {
        
        // PUNTO 2
    List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
    
    // Creación
    VideoJuego video1 = new VideoJuego(123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
    VideoJuego video2 = new VideoJuego(456, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
    VideoJuego video3 = new VideoJuego(789, "Age of Empire II", "PC", 4, "Estrategia");
    VideoJuego video4 = new VideoJuego(101, "Counter Strike 1.6", "PC", 4, "Shooter");
    VideoJuego video5 = new VideoJuego(100, "Mario Kart 64", "Nintendo 64", 2, "Plataforma");
    
    // Agregar a lista
    listaVideojuegos.add(video1);
    listaVideojuegos.add(video2);
    listaVideojuegos.add(video3);
    listaVideojuegos.add(video4);
    listaVideojuegos.add(video5);
    
    // PUNTO 3 - Recorrer juegos
    for (VideoJuego video : listaVideojuegos) {
            System.out.println(
                    "Título: " + video.getTitulo() +
                    " Consola: " + video.getConsola() +
                    " Cantidad Jugadores: " + video.getCantJugadores()
            );
    }
    
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    
    // PUNTO 4 - Cambio de nombre y jugadores
    video1.setTitulo("Banjo Kazooie II");
    video1.setCantJugadores(1);
    
    video5.setTitulo("Super Mario Kart 64");
    video5.setCantJugadores(4);
    
    // PUNTO 5
    for (VideoJuego video : listaVideojuegos) {
        if (video.getConsola().equals("Nintendo 64")) {
            System.out.println(video.toString());
        }
    }
        
    }
}
