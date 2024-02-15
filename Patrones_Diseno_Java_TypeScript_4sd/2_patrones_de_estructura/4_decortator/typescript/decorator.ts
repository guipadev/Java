// Interfaz que representa un café
interface Coffee {
    cost(): number;
    getDescription(): string;
}

// Implementación concreta de un café simple
class SimpleCoffee implements Coffee {
    cost(): number {
        return 2.0; // Un café simple cuesta $2.00
    }

    getDescription(): string {
        return "Café simple";
    }
}

// Decorador para agregar leche al café
class MilkDecorator implements Coffee {
    private coffee: Coffee;

    constructor(coffee: Coffee) {
        this.coffee = coffee;
    }

    cost(): number {
        /* Agregamos el costo de 
        la leche al costo base del café*/
        return this.coffee.cost() + 1.0; 
        // La leche cuesta $1.00 extra
    }

    getDescription(): string {
        //Agregamos "con leche" a la descripción del café
        return this.coffee.getDescription() + " con leche";
    }
}

// Pedimos un café simple
const simpleCoffee: Coffee = new SimpleCoffee();
console.log("Café simple cost: $" + simpleCoffee.cost());
console.log("Description: " + simpleCoffee.getDescription());

// Pedimos un café con leche
const coffeeWithMilk: Coffee = new MilkDecorator(simpleCoffee);
console.log("Café con leche cost: $" + coffeeWithMilk.cost());
console.log("Description: " + coffeeWithMilk.getDescription());