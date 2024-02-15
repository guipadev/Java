// Interfaz deseada para todos los servicios de pago
interface PaymentService {
    processPayment(amount: number): void;
}

// Implementación concreta de un servicio de pago
class CreditCardPayment {
    makePayment(amount: number) {
        console.log(`Paid ${amount} using credit card.`);
    }
}

// Adaptador para la interfaz de PaymentService
class PaymentAdapter implements PaymentService {
    private creditCardPayment: CreditCardPayment;
    constructor(creditCardPayment: CreditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }
    processPayment(amount: number): void {
        this.creditCardPayment.makePayment(amount);
    }
}

// Código principal
const creditCardPayment = new CreditCardPayment();
const paymentService: PaymentService = new PaymentAdapter(creditCardPayment);
paymentService.processPayment(100.00);

