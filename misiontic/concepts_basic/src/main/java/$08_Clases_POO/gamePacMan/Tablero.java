package $08_Clases_POO.gamePacMan;

public class Tablero {
    private PacMan personaje;
    private int nivel;

    public Tablero(PacMan personaje) {
        this.personaje = personaje;
        this.nivel = 0;
    }

    public void comprobarNivelActual() {
        int puntos = this.personaje.obtenerPuntuacion();
        int nivelActual = puntos / 25 + 1;
        this.nivel = nivelActual;
    }

    public PacMan getPersonaje() {
        return personaje;
    }

    public void setPersonaje(PacMan personaje) {
        this.personaje = personaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}