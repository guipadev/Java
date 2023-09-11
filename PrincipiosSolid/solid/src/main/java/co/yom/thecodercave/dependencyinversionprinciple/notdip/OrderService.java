package co.yom.thecodercave.dependencyinversionprinciple.notdip;

public class OrderService {

    /**
     * El problema es que aquí datadogService no es una abstración si no una clase completa
     * Si el dia de mañana cambio el servicio, porque dataDog sube el precio y ya no funciona
     * o sirve más, o se pretende probar algo nuevo, se tiene que cambiar la clase de OrderService
     * Lo que no tiene ningun sentido, porque en realidad lo que se desea es hacer es la acción
     * de logear el evento, no cambia, lo que cambia es la acción donde voy a logear
     */
    private final DataDogService datadogService;

    /**
     * Se recibe por parametro la implementación
     * Es decir el servicio DataDog
     * @param datadogService recibe el servicio datadogService
     */
    public OrderService(DataDogService datadogService) {
        this.datadogService = datadogService;
    }

    /**
     * A la hora de generar la orden
     * @param order
     */
    public void GenerateOrder(Order order) {

        // TODO: código para crear la orden

        // Enviar notificación para datadog
        datadogService.LogEvent("The Order was successfully created");
    }
}
