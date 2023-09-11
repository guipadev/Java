package co.yom.thecodercave.interfacesegregationprinciple.isp;

/**
 * Cada servicio puntual va a implementar la interfaz especifica
 * entonces hemos segregado las interfaces, las hemos separado
 * las hemos condesadas a una sola finalidad
 * Y ahora cada servicio puede encargarse/ocuparse de lo que le compete
 */
public class BurgerOrderService implements IOrderBurgerService{
    @Override
    public void OrderBurger(int quantity) {
        // Orden de hamburguesa
    }
}
