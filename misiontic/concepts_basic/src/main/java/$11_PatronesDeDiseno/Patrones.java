package PatronesDeDiseno;

import PatronesDeDiseno.decorator.BorderShapeDecorator;
import PatronesDeDiseno.decorator.Circle;
import PatronesDeDiseno.decorator.RedShapeDecorator;
import PatronesDeDiseno.facade.ShapeMaker;
import PatronesDeDiseno.factory.Shape;
import PatronesDeDiseno.factory.ShapeFactory;
import PatronesDeDiseno.observer.Observer;
import PatronesDeDiseno.observer.Subject;
import PatronesDeDiseno.singleton.SingleObject;

public class Patrones {

    public static void probarFactory(){
        ShapeFactory factory = new ShapeFactory();
        //Crear circulo
        Shape c1 = factory.getShape('c');
        c1.draw();
        //Crear cuadrado
        Shape s1 = factory.getShape('s');
        s1.draw();
    }

    public static void probarSingleton() {
        SingleObject so = SingleObject.getInstance();
        System.out.println(so);

        SingleObject so1 = SingleObject.getInstance();
        System.out.println(so1);

        SingleObject so2 = SingleObject.getInstance();
        System.out.println(so2);

        so1.setNombre("Juancho");
        System.out.println(so1.getNombre());
        so2.setNombre("Laura");
        System.out.println(so1.getNombre());
    }

    public static void probarDecorator(){
        PatronesDeDiseno.decorator.Shape c1 = new Circle();
        PatronesDeDiseno.decorator.Shape redC2 = new RedShapeDecorator(new Circle());

        c1.draw();
        redC2.draw();

        PatronesDeDiseno.decorator.Shape c3 = new BorderShapeDecorator(redC2);
        c3.draw();
    }

    public static void probarFacade(){
        //Creamos instancia de nuestra fachada
        ShapeMaker sm = new ShapeMaker();

        //Podemos dibujar solo invocando sin saber como se realizo el proceso
        sm.drawCircle();
        sm.drawSquare();
        sm.drawRectangle();
    }

    public static void probarObservador(){
        Subject s = new Subject();
        Observer o1 = new Observer("Juan", s);
        Observer o2 = new Observer("Camilo", s);
        //cambiando estado
        s.setState(10);

        //Otro ejemplo cambio de estado
        Subject s2 = new Subject();
        Observer o3 = new Observer("Laura", s2);
        s2.setState(11);
        s2.setState(-1);
    }

    public static void main(String[] args) {
        System.out.println("********* MOSTRANDO RESULTADO PATRON FACTORY **********");
        probarFactory();

        System.out.println("********* MOSTRANDO RESULTADO PATRON SINGLETON **********");
        probarSingleton();

        System.out.println("********* MOSTRANDO RESULTADO PATRON DECORATOR **********");
        probarDecorator();

        System.out.println("********* MOSTRANDO RESULTADO PATRON FACADE **********");
        probarFacade();

        System.out.println("********* MOSTRANDO RESULTADO PATRON OBSERVER **********");
        probarObservador();

    }



}
