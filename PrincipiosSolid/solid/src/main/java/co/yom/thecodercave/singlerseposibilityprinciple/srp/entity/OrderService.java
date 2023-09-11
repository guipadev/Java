package co.yom.thecodercave.singlerseposibilityprinciple.srp.entity;

import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.OrderRepository;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.NotificationService;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.InvoiceService;
import co.yom.thecodercave.singlerseposibilityprinciple.srp.service.impl.LoggerService;

/**
 * La Clase OrderService
 * Ahora tiene como único propósito conectar los distintos servicios
 * Única responsabilidad de ser un pasamano un gateway, osea lo único que hace
 * es recibir una orden y enviarla a los servicios que tiene que enviar
 * para que cumpla la lógica de negocio
 */
public class OrderService {

    private final OrderRepository orderRepository;
    private final NotificationService notificationService;
    private final InvoiceService invoiceService;
    private final LoggerService loggerService;

    /**
     * Constructor recibe por parametro las depedencias inyectadas declaradas anteriormente
     * @param orderRepository orden de pedido
     * @param notificationService notificación email
     * @param invoiceService factura
     * @param loggerService login
     */
    public OrderService(
            OrderRepository orderRepository,
            NotificationService notificationService,
            InvoiceService invoiceService,
            LoggerService loggerService
    ) {
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
        this.invoiceService = invoiceService;
        this.loggerService = loggerService;
    }

    /**
     * Ahora no tenemos más métodos internos
     * Se llama ahora las dependencias que se necesita
     * @param order
     */
    public void saveOrder(Order order) {
        try {
            // Necesitamos insertan un Orden, llamamos al orderRepository
            orderRepository.InsertOrder(order);

            // Se pide al servicio invoiceService y que lo devuelva, no nos importa como
            var invoice = invoiceService.CreateInvoice(order);

            // Envíar email lo mismo, pedimos que envie el email y no importa como lo hace
            notificationService.EmailInvoice(invoice);

            // El método loggerService que tien un metodo Info y Error
            // Pasamos el método sin importar como lo hace por dentro
            loggerService.Info("The order has been complete");

        } catch (Exception e) {
            loggerService.Error(e.getMessage(), e);
        }
    }
}
