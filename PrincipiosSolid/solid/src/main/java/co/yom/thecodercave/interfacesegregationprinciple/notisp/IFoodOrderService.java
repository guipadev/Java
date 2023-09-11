package co.yom.thecodercave.interfacesegregationprinciple.notisp;

/**
 * Interfaz con 3 métodos
 */
public interface IFoodOrderService {

    // Ordenar hamburguesa
    void OrderBurger(int quantity);

    // Ordenar un bufe
    void OrderSteak(int quantity);

    // Ordenar ensalada
    void OrderSalad(int quantity);
}
