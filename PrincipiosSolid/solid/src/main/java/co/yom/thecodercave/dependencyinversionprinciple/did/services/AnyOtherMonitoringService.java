package co.yom.thecodercave.dependencyinversionprinciple.did.services;

/**
 * Aquí tengo otro servicio
 * Que tambien implementa la interface que contiene el metodo de logeo
 */
public class AnyOtherMonitoringService implements IEventNotificationService {
    @Override
    public void LogEvent(String message) {

    }
}
