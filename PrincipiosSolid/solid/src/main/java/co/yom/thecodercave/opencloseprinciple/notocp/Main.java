package co.yom.thecodercave.opencloseprinciple.notocp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<Order>();

        ReportingService service = new ReportingService();

        service.GenerateReport(orders, ReportType.EXCEL);
    }
}
