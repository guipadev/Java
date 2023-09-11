package co.yom.thecodercave.interfacesegregationprinciple.notisp;

/**
 * Este servicio solo dedicado a la hamburguesa
 * Porque debo hacer cosas particulares cuando me piden una hamburguesa
 * Al implementar la interfaz IFoodOrderService, solamento puede implementar
 * el método de la orden de la hamburguesa
 * No puedeo ordenar bufe y ensalada porque desde este servicio no lo puede hacer
 */
public class BurgerOrderService implements IFoodOrderService {
    @Override
    public void OrderBurger(int quantity) {
        // Ordenar hamburguesa
    }

    @Override
    public void OrderSteak(int quantity) {
        throw new RuntimeException("Can't order a salad from this service");
    }

    @Override
    public void OrderSalad(int quantity) {
        throw new RuntimeException("Can't order a steak from this service");
    }
}
