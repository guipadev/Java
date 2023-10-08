package co.luigicode.patronesestructurales.flyweight.assets;

public class Sound {

    private String sounds;

    public Sound(String sounds) {
        this.sounds = sounds;
    }

    @Override
    public String toString() {
        return sounds;
    }
}
