/* Interfaz Handler que define el manejo de solicitudes */
interface Handler {
    setNextHandler(nextHandler: Handler): void;
    processRequest(request: PurchaseRequest): void;
}

// Clase que representa una solicitud de compra
class PurchaseRequest {
    constructor(private amount: number) {}

    getAmount(): number {
        return this.amount;
    }
}

// Clase concreta que maneja solicitudes de bajo valor
class JuniorManager implements Handler {
    private nextHandler: Handler | null = null;

    setNextHandler(nextHandler: Handler): void {
        this.nextHandler = nextHandler;
    }

    processRequest(request: PurchaseRequest): void 
    {
        if (request.getAmount() <= 1000) {
            console.log("Solicitud de compra aprobada por el Junior Manager.");
        } else if (this.nextHandler) {   
            this.nextHandler.processRequest(request);
        } else {
            console.log("La solicitud de compra requiere aprobación adicional.");
        }
    }
}

// Clase concreta que maneja solicitudes de valor medio
class SeniorManager implements Handler {
    private nextHandler: Handler | null = null;

    setNextHandler(nextHandler: Handler): void {
        this.nextHandler = nextHandler;
    }

    processRequest(request: PurchaseRequest): void 
    {
        if (request.getAmount() <= 5000) {
            console.log("Solicitud de compra aprobada por el Senior Manager.");
        } else if (this.nextHandler) {  
          this.nextHandler.processRequest(request);
        } else {
            console.log("La solicitud de compra requiere aprobación adicional.");
        }
    }
}

// Clase concreta que maneja solicitudes de alto valor
class Director implements Handler {
    setNextHandler(nextHandler: Handler): void {
        /* El Director es el último en la cadena, 
        no se establece un próximo manejador.*/
    }

    processRequest(request: PurchaseRequest): void 
    {
        if (request.getAmount() <= 10000) {
            console.log("Solicitud de compra aprobada por el Director.");
        } else {
            console.log("La solicitud de compra fue rechazada.");
        }
    }
}

const juniorManager = new JuniorManager();
const seniorManager = new SeniorManager();
const director = new Director();

juniorManager.setNextHandler(seniorManager);
seniorManager.setNextHandler(director);

// Simulamos solicitudes de compra
const request1 = new PurchaseRequest(800);
const request2 = new PurchaseRequest(4500);
const request3 = new PurchaseRequest(12000);

// Procesamos las solicitudes
juniorManager.processRequest(request1);
juniorManager.processRequest(request2);
juniorManager.processRequest(request3);
