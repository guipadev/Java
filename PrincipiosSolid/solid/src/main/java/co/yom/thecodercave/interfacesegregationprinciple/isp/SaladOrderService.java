package co.yom.thecodercave.interfacesegregationprinciple.isp;

/**
 * Cada servicio puntual va a implementar la interfaz especifica
 * entonces hemos segregado las interfaces, las hemos separado
 * las hemos condesadas a una sola finalidad
 * Y ahora cada servicio puede encargarse/ocuparse de lo que le compete
 */
public class SaladOrderService implements IOrderSaladService {
    @Override
    public void OrderSalad(int quantity) {
        // Orden de ensalada
    }
}
