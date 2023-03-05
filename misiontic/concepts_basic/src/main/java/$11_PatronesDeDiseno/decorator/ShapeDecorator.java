package PatronesDeDiseno.decorator;

/**
 * Patron Decorator
 * Permite crear o extender funcionalidades, sin necesidad de cambiar las clases en si
 * Podriamos usar las mismas clases, podemos hacer nuevos comportamientos a partir de estas clases
 * Ejemplo hizo una aplicacion que recibe notificacion por email, y luego estan las notificaciones de redes sociales
 * en vez de cambiar todo el codigo con el decorador se agregan esta nueva funcionalidad
 ****/

public class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
