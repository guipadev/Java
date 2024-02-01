package $09_clases_abstractas;

public abstract class Figura {
    
    protected double x; // posición en x
    protected double y; // posición en y
    
    // Constructores en protected
    // Puede haber, pero solo ser utilizados por las clases hijas

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
        
    // Al menos debe tener un Método abstracto
    public abstract double calcularArea();
    
}
