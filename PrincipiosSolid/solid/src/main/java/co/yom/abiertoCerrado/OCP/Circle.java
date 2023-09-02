package co.yom.abiertoCerrado.OCP;

public class Circle implements Shape {
    double radius;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
