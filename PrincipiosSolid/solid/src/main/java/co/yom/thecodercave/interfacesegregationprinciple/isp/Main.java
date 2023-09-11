package co.yom.thecodercave.interfacesegregationprinciple.isp;

import co.yom.thecodercave.interfacesegregationprinciple.notisp.BurgerOrderService;

/**
 * Desde el programa principal podemos ver que no cambia nada
 * Pero desde el punto de vista de la Arquitectura es más eficiente
 */
public class Main {

    public static void main(String[] args) {

        BurgerOrderService service = new BurgerOrderService();

        service.OrderBurger(2);
    }
}
