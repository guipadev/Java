package co.luigicode.patronesestructurales.flyweight;

import co.luigicode.patronesestructurales.flyweight.assets.Animation;
import co.luigicode.patronesestructurales.flyweight.assets.Prefabricado;
import co.luigicode.patronesestructurales.flyweight.assets.Sound;
import co.luigicode.patronesestructurales.flyweight.assets.Texture;

import java.util.Arrays;
import java.util.List;

public class TestFlyweight {

    public static void main(String[] args) {

        List<Animation> animations = Arrays.asList(
                new Animation("Saltar"),
                new Animation("Correr")
        );

        List<Texture> textures = Arrays.asList(
                new Texture("Hierro"),
                new Texture("Platino")
        );

        List<Sound> sounds= Arrays.asList(
                new Sound("Auuu"),
                new Sound("Guauu")
        );

        Prefabricado prefab1 = new Prefabricado(animations, textures, sounds);
        Npc npc1 = new Npc(prefab1);
        Npc npc2 = new Npc(prefab1);
        System.out.println("=== NPC 1 ===");
        npc1.showNpc();
        System.out.println("=== NPC 2 ===");
        npc2.showNpc();

        /************************************************/

        List<Animation> animations2 = Arrays.asList(
                new Animation("Volar"),
                new Animation("Nadar")
        );

        List<Texture> textures2 = Arrays.asList(
                new Texture("Madera"),
                new Texture("Roca")
        );

        List<Sound> sounds2 = Arrays.asList(
                new Sound("Miauuu"),
                new Sound("Muuuu")
        );

        Prefabricado prefab2 = new Prefabricado(animations2, textures2, sounds2);
        Npc npc3 = new Npc(prefab2);
        Npc npc4 = new Npc(prefab2);
        System.out.println("=== NPC 3 ===");
        npc3.showNpc();
        System.out.println("=== NPC 4 ===");
        npc4.showNpc();
    }


}
