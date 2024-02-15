// Interfaz Observer
interface Observer {
    update(message: string): void;
}

// Clase concreta Observable (Sujeto)
class Stock {
    private symbol: string;
    private price: number;
    private observers: Observer[] = [];

    constructor(symbol: string, price: number) {
        this.symbol = symbol;
        this.price = price;
    }

    addObserver(observer: Observer): void {
        this.observers.push(observer);
    }

    removeObserver(observer: Observer): void {
        this.observers = this.observers.filter(
        o => o !== observer);
    }



    setPrice(price: number): void {
        this.price = price;
        this.notifyObservers();
    }

    private notifyObservers(): void {
        const message = `Precio de ${this.symbol} ha cambiado a ${this.price}`;
        this.observers.forEach(observer => 
        observer.update(message));
    }
}

// Clase concreta Observer (Observador)
class Investor implements Observer {
    private name: string;

    constructor(name: string) {
        this.name = name;
    }

    update(message: string): void {
        console.log(`${this.name} recibió una actualización: ${message}`);
    }
}

// Cliente
function main() {
    // Crear acciones
    const appleStock: Stock = new Stock("AAPL", 
    150.0);
    const googleStock: Stock = new Stock("GOOGL", 
    2500.0);

    // Crear inversores
    const investor1: Investor = new 
    Investor("Inversor 1");

    const investor2: Investor = new 
    Investor("Inversor 2");



    // Registrar inversores como observadores
    appleStock.addObserver(investor1);
    appleStock.addObserver(investor2);
    googleStock.addObserver(investor2);

    /* Simular cambios en los precios de las 
       acciones*/
    appleStock.setPrice(155.0);
    googleStock.setPrice(2600.0);
}

main();