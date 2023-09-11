package co.yom.thecodercave.opencloseprinciple.ocp;

import co.yom.thecodercave.opencloseprinciple.ocp.service.IReportGenerator;

import java.util.List;

public class ReportingServices {

    private final IReportGenerator reportGenerator;

    /**
     * Un constructor que recibe una interfaz que es el generador de reportes
     * como un motor que genera reportes a esta clase no le importa como lo generar y de que tipo es
     * lo único que importa es que de esta lista de ordenes se genere el reporte
     * El como lo van a definir las extensiones que estan en reportGenerator
     *
     * @param reportGenerator  interfaz generadora de reporte
     */
    public ReportingServices(IReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }
    public void GenerateReport(List<Order> orders) {
        reportGenerator.createReport(orders);
    }
}
