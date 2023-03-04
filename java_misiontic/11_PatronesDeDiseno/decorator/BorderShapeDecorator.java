package PatronesDeDiseno.decorator;

public class BorderShapeDecorator extends ShapeDecorator{

    public BorderShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Bordes más gruesos");
    }
}
