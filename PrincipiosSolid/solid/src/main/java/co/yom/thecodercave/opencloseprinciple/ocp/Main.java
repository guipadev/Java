package co.yom.thecodercave.opencloseprinciple.ocp;

import co.yom.thecodercave.opencloseprinciple.ocp.service.impl.ReportGeneratorExcel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lista de ordenes que podria venir de la BD
        List<Order> orders = new ArrayList<>();

        // Cuando creamos el service, enviamos por parametro, la implementaciín ya sea el tipo de reporte (Excel, PDF, Json, Xml)
        ReportingServices service = new ReportingServices(new ReportGeneratorExcel());

        // Luego solicitamos al servicio que genere el reporte
        service.GenerateReport(orders);
    }
}
