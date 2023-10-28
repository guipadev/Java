package co.luigicode.patronescomportamiento.memento;

public class Juego {

    private String nombre;
    private int nivel;
    private int muertes;

    private static MementoManejador manager = new MementoManejador();

    public Juego(String nombre) {
        this.nombre = nombre;
    }

    public Juego(String nombre, int nivel, int muertes) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.muertes = muertes;
    }

    public void guardar() {
        manager.guardar(new Memento(this));
    }

    public void desahacer() {
        Memento memento = manager.undo();

        setNivel(memento.getNivel());
        setMuertes(memento.getMuertes());
    }

   public void rehacer() {
       Memento memento = manager.redo();

       setNivel(memento.getNivel());
       setMuertes(memento.getMuertes());
   }

    public String getNombre() {
        return nombre;
    }

    public Juego setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getNivel() {
        return nivel;
    }

    public Juego setNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    public int getMuertes() {
        return muertes;
    }

    public Juego setMuertes(int muertes) {
        this.muertes = muertes;
        return this;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", nivel=" + nivel +
                ", muertes=" + muertes;
    }
}
