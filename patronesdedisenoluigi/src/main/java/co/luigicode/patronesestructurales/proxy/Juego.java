package co.luigicode.patronesestructurales.proxy;

/**
 * Vamos a implementar una interfaz que la va a tener dos clases
 * ya que vamos a hacer un proxy virtual, simulando un archivo muy pesado
 * que esta guardado en el disco duro, y no queremos constatemente accediendo y modificando directamente,
 * por lo cual se coje dicho objeto y lo cargamos en memoria
 * Habra una clase para escribir en el disco duro
 * Y la clase proxy que implementa la misma interface
 */
public interface Juego {

    void save(String name);
    Estados load(String name);
}

