// Subsistema de manejo de inventario
class InventorySystem {
    checkInventory(items: string[]): void {
        //Lógica para verificar el inventario de productos
        console.log("Verificando inventario...");
    }
}

// Subsistema de procesamiento de pagos
class PaymentSystem {
    processPayment(amount: number): void {
        // Lógica para procesar el pago
        console.log(`Procesando el pago de $${amount}`);
    }
}

// Subsistema de envío de pedidos
class ShippingSystem {
    shipOrder(items: string[]): void {
        // Lógica para enviar el pedido
        console.log("Enviando el pedido...");
    }
}

class OrderFacade {
    private inventorySystem: InventorySystem;
    private paymentSystem: PaymentSystem;
    private shippingSystem: ShippingSystem;

    constructor() {
        this.inventorySystem = new 
        InventorySystem();
        this.paymentSystem = new PaymentSystem();
        this.shippingSystem = new ShippingSystem();
    }

    placeOrder(items: string[], amount: number): void {
        // Verificar el inventario
        this.inventorySystem.checkInventory(items);

        // Procesar el pago
        this.paymentSystem.processPayment(amount);

        // Enviar el pedido
        this.shippingSystem.shipOrder(items);
        console.log("Pedido completado con éxito.");
    }
}

// Código principal
const orderFacade = new OrderFacade();
const items = ["Producto1", "Producto2"];
const amount = 100.0;

orderFacade.placeOrder(items, amount);