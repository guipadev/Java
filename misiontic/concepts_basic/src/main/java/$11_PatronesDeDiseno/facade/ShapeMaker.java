package PatronesDeDiseno.facade;

import PatronesDeDiseno.factory.Circle;
import PatronesDeDiseno.factory.Rectangle;
import PatronesDeDiseno.factory.Shape;
import PatronesDeDiseno.factory.Square;

/**Patron facade - fachada
 * Solo ve lo que hay en la fachada
 * Esconder la logica que esta por detras
 * Es bueno tener fachadas para facilitar el uso de ciertas clases, metodos o inclusive una aplicacion completa
 * procedimiento o calculo complejo
 * **/

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
