package $08_Clases_POO.gamePacMan;;
public class PacMan {
    private String color;
    private int puntuacion;
    private int vidas;

    public PacMan(String color, int puntuacion, int vidas) {
        this.color = color;
        this.puntuacion = puntuacion;
        this.vidas = vidas;
    }

    public PacMan() {
        this("Amarillo", 0, 3);
    }

    public void sumarPuntuacion() {
        this.puntuacion += 1;
    }

    public int obtenerPuntuacion() {
        return this.puntuacion;
    }

    public void restarVida() {
        this.vidas -= 1;
    }

    public boolean sigueVivo() {
        return this.vidas > 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}

