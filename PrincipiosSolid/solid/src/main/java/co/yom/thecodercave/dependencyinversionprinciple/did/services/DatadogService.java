package co.yom.thecodercave.dependencyinversionprinciple.did.services;

/**
 * El servicio DatadogService implementa la interfaz que posee el LogEvent
 * para logear el evento
 */
public class DatadogService implements IEventNotificationService {
    @Override
    public void LogEvent(String message) {
        // Código para logear el evento en datadog
    }
}
