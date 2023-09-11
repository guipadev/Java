package co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.ILoggerService;

/**
 * Unica responsabilidad
 * Esta clase lo único que hace es encargarse del login y nada mas
 */
public class LoggerService implements ILoggerService {

    public LoggerService(){

    }

    @Override
    public void Info(String info) {

    }

    @Override
    public void Debug(String info) {

    }

    @Override
    public void Error(String message, Exception ex) {

    }
}
