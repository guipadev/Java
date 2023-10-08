package co.luigicode.patronesestructurales.flyweight.assets;

public class Texture {
    private String textures;

    public Texture(String textures) {
        this.textures = textures;
    }

    @Override
    public String toString() {
        return textures;
    }
}
