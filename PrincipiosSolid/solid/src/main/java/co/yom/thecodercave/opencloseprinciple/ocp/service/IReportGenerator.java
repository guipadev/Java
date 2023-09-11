package co.yom.thecodercave.opencloseprinciple.ocp.service;

import co.yom.thecodercave.opencloseprinciple.ocp.Order;

import java.util.List;

public interface IReportGenerator {

    // No le interesa como va a crear el reporte
    void createReport(List<Order> orders);
}
