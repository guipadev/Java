package co.luigicode.patronesestructurales.flyweight;

import co.luigicode.patronesestructurales.flyweight.assets.Prefabricado;

public class Npc {


    private static final int MAX_HEALTH = 100;
    private static int id = 1;
    private String name;
    private int health;
    private Coordinates coordinates;

    // Al estar cargando estas listas, la tarjeta de memoria revienta

    // Por cada Npc tengo que crear una lista de animaciones y cargarlas
    // private List<Animations> animations = new ArrayList<>();
    // Por cada Npc tengo que crear una lista de texturas y cargarlas
    //private List<Textures> textures = new ArrayList<>();
    // Por cada Npc tengo que crear una lista de sonidos y cargarlas
    //private List<Sounds> sounds = new ArrayList<>();

    /*
    public Npc(String name, int health, Coordinates coordinates, List<Animations> animations, List<Textures> testures, List<Sounds> sounds) {
        this.name = "NPC" + id;
        this.health = MAX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.animations = animations;
        this.textures = textures;
        this.sounds = sounds;
        id++;
    }
     */

    // Aquí pasamos todo lo que se va a compartir entre las instancias del objeto y así hacemos los que queramos
    private Prefabricado prefabricado;

    public Npc(Prefabricado prefabricado) {
        this.name = "NPC" + id;
        this.health = MAX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.prefabricado = prefabricado;
        id++;
    }

    public void showNpc() {
        System.out.println("name: " + name);
        System.out.println("health: " + health);
        System.out.println(coordinates);
        System.out.println("=== Prefab ===");
        System.out.println(prefabricado);
    }
}
