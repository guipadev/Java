package co.yom.thecodercave.interfacesegregationprinciple.notisp;

public class Main {

    public static void main(String[] args) {

        /**
         * Aquí no se nota el problema porque simplemente invoco al servicio
         * que me permite pedir hamburguesa, en este caso pide 2
         * Pero sabemos que en la Arquitectura de la aplicación hay un problema
         */

        BurgerOrderService service = new BurgerOrderService();

        service.OrderBurger(2);
    }
}
