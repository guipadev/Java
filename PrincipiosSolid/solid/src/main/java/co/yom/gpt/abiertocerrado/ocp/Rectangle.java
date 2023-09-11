package co.yom.gpt.abiertocerrado.ocp;

public class Rectangle implements Shape {
    double width;
    double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}