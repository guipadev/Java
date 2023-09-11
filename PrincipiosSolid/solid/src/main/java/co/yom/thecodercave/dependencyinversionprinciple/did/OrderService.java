package co.yom.thecodercave.dependencyinversionprinciple.did;

import co.yom.thecodercave.dependencyinversionprinciple.did.services.IEventNotificationService;

/**
 * La clase ahora dejo de depender de lo que era antes la clase DataDogService
 * Ahora depende de la abstracción
 * Por lo tanto si yo cambio DatadogService, nunca voy a tener que tocar OrderService
 * Porque la lógica de negocio simplemente es que se loge el evento y no tiene nada que ver con la orden
 * Así que no deberia tener que cambiar esta clase, cuya responsabilidad no es y no tiene que ver con el login
 *
 * A la hora de utilizar esta clase le pasamos por parametro, la implementación que queremos usar
 * si es la de datadog o si es algun otro servicio
 *
 */
public class OrderService {

    // Obtengo la abstracción
    private final IEventNotificationService eventNotificationService;


    // Recibo la abstracción por parametro
    public OrderService(IEventNotificationService eventNotificationService) {
        this.eventNotificationService = eventNotificationService;
    }

    public void GenerateOrder(Order order) {

        // TODO: código para crear la orden

        // Aquí logeo el evento donde quiero - Enviar notificación para datadog
        eventNotificationService.LogEvent("The Order was successfully created");
    }
}
