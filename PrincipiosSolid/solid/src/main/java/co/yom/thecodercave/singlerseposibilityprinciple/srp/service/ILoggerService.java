package co.yom.thecodercave.singlerseposibilityprinciple.srp.service;

/**
 * Servicio login ya que no sabemos si va a ser en un:
 * - Archivo de texto
 * - En un servicio externo
 * - Simplemente en consola
 */
public interface ILoggerService {

    void Info(String info);
    void Debug(String info);
    void Error(String message, Exception ex);
}
