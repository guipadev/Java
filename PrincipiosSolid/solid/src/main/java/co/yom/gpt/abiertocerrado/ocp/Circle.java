package co.yom.gpt.abiertocerrado.ocp;

public class Circle implements Shape {
    double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
