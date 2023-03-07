package $10_Herencia_Polimorfismo.carAbstract;

public class Main {

    public static void main(String[] args) {

        Automovil car1 = new Automovil(5, 150);
        Automovil car2 = new Automovil(5, 120);
        Automovil car3 = new Automovil(5, 110);

        car1.pintar(0);

        car2.pintar(1);
        car3.pintar(2);
    }
}
