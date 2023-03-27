package claabstracta;

public abstract class Figura {
    
    protected double x;
    protected double y;
    
    // Constructores
    // Puede haber, pero solo ser utilizados por las clases hijas

    protected Figura() {
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
        
    // Al menos debe tener un Método abstracto
    public abstract double calcularArea();
    
}
