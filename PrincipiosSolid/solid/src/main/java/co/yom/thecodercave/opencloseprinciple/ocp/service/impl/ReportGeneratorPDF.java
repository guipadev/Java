package co.yom.thecodercave.opencloseprinciple.ocp.service.impl;

import co.yom.thecodercave.opencloseprinciple.ocp.Order;
import co.yom.thecodercave.opencloseprinciple.ocp.service.IReportGenerator;

import java.util.List;

/**
 * De esta forma si el cliente nos pide crear una nueva implementación (nuevo tipo reporte)
 * Lo único que debo es crear una nueva clase como esta y que implemente la interfaz IReporteGenerator
 */
public class ReportGeneratorPDF implements IReportGenerator {

    /**
     * Así nos obliga a cumplir con la implementación
     * Y esta implementación  podemos hacer lo que queramos como exporta a Excel
     * @param orders lista orden
     */
    @Override
    public void createReport(List<Order> orders) {

    }
}
