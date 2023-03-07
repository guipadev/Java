package $11_PatronesDeDiseno.factory;

/*
 * Patron Factory
 * Una clase que esconde la creacion de objetos y que
 * esta clase se la encargada de crear los objetos
 * */

public class ShapeFactory {

    public Shape getShape(char type){
        switch(type){
            case 'c':
                return  new Circle();
            case 'r':
                return new Rectangle();
            case 's':
                return new Square();
            default:
                return null;
        }
    }
}
