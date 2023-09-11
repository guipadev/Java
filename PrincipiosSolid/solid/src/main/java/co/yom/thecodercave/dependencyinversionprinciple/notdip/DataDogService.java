package co.yom.thecodercave.dependencyinversionprinciple.notdip;

/**
 * Servicio de monitoreo de aplicaciones, en este caso permite logear eventos:
 * Osea que desde mi aplicación puedo hacer que mi login en vez de ir a un archivo de texto
 * vaya a DataDog directamente
 */
public class DataDogService {

    /**
     * Cuando un evento ocurra, osea cuando algo pase voy a invocar esto método
     * Y va enviar este método, esa información a DataDog
     * @param message
     * @return
     */
    public String LogEvent(String message){
        // Codigo para evento en DataDog
        return message;
    }
}
