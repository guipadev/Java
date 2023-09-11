package co.yom.thecodercave.opencloseprinciple.notocp;

import java.util.List;

/**
 * Servicio de Reportes - Crear 2 tipos de reportes en PDF y EXCEL
 * Pero si nos piden que tambien se deba generar reportes en JSON, XML
 * Y nos siguen pidiendo más tipos de reportes, vamos a estar que modificando
 * el ENUM, agregar más condicionales y crear nuevos métodos
 * Entonces cada vez debemos esta modificando este código
 */
public class ReportingService {

    /**
     * Recibe parametros para genera reportes
     * @param orders lista ordenes
     * @param type tipo de reporte
     */
    public void GenerateReport(List<Order> orders, ReportType type) {

        if (type == ReportType.PDF) {
            CreatePDFReport(orders);
        } else if (type == ReportType.EXCEL) {
            createExcelReport(orders);
        } // Agregar más condicionales
        else if (type == ReportType.JSON) {
            CreateJsonReport(orders);
        } else if (type == ReportType.XML) {
            createXmlReport(orders);
        }
    }

    private void createExcelReport(List<Order> orders) {
    }

    private void CreatePDFReport(List<Order> orders) {
    }

    // Se deben crear nuevos métodos
    private void createXmlReport(List<Order> orders) {
    }

    private void CreateJsonReport(List<Order> orders) {
    }


}
