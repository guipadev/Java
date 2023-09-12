package co.yom.thecodercave.singlerseposibilityprinciple;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.Order;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.entity.OrderService;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.InvoiceService;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.LoggerService;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.NotificationService;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.OrderRepository;

public class Main {

    public static void main(String[] args) {

        // Crear una instancia de Order
        Order mesa1 = new Order(1, "Cliente Rigo", 100.0);

        // Crea instancias de las dependencias
        OrderRepository orderRepository = new OrderRepository();
        NotificationService notificationService = new NotificationService();
        InvoiceService invoiceService = new InvoiceService();
        LoggerService loggerService = new LoggerService();

        // Crea una instancia de OrderService e inyecta las dependencias
        OrderService orderService = new OrderService(
                orderRepository,
                notificationService,
                invoiceService,
                loggerService
        );

        // Procesar la orden utilizando OrderService
        orderService.saveOrder(mesa1);


        // Mostrar resultados por consola
        System.out.println("Orden procesada exitosamente." + mesa1);

    }
}
