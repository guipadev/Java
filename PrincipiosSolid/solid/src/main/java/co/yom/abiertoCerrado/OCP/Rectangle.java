package co.yom.abiertoCerrado.OCP;

public class Rectangle implements Shape {
    double width;
    double height;

    @Override
    double calculateArea() {
        return width * height;
    }
}