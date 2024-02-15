// Interfaz que representa un estado de la máquina expendedora
interface VendingMachineState {
    insertMoney(): void;
    ejectMoney(): void;
    selectBeverage(): void;
    dispense(): void;
}

// Clase concreta para el estado "Sin dinero"
class NoMoneyState implements VendingMachineState {
    insertMoney(): void {
        console.log("Dinero insertado");
    }

    ejectMoney(): void {
        console.log("No se puede expulsar dinero, no se ha insertado dinero");
    }

    selectBeverage(): void {
        console.log("No se puede seleccionar una bebida, inserta dinero primero");
    }

    dispense(): void {
        console.log("No se puede dispensar una bebida, inserta dinero primero");
    }
}

/* Clase concreta para el estado "Seleccionando bebida"*/
class SelectingBeverageState implements VendingMachineState {

    insertMoney(): void {
        console.log("Dinero ya insertado,  espere...");
    }

    ejectMoney(): void {
        console.log("Dinero devuelto");
    }

    selectBeverage(): void {
        console.log("Bebida seleccionada, espere...");
    }

    dispense(): void {
        console.log("Bebida dispensada");
    }
}

// Clase concreta para el estado "Entregando bebida"
class DispensingState implements VendingMachineState {
    insertMoney(): void {
        console.log("Dinero ya insertado, espere...");
    }

    ejectMoney(): void {
        console.log("Dinero devuelto");
    }

    selectBeverage(): void {
        console.log("Bebida seleccionada, espere...");
    }

    dispense(): void {
        console.log("Bebida dispensada");
    }
}

// Clase que representa la máquina expendedora
class VendingMachine {
    private state: VendingMachineState;

    constructor() {
        this.state = new NoMoneyState(); 
        /* Inicialmente, la máquina está en el 
           estado "Sin dinero" */
    }

    insertMoney(): void {
        this.state.insertMoney();
        if (this.state instanceof NoMoneyState) {
            this.state = new 
            SelectingBeverageState();
        }
    }

    ejectMoney(): void {
        this.state.ejectMoney();
        if (this.state instanceof 
            SelectingBeverageState) {
            this.state = new NoMoneyState();
        }
    }

    selectBeverage(): void {
        this.state.selectBeverage();
        if (this.state instanceof 
            SelectingBeverageState) {
            this.state = new DispensingState();
        }
    }

    
    dispense(): void {
        this.state.dispense();
        if (this.state instanceof DispensingState) 
        {
            this.state = new NoMoneyState();
        }
    }
}

// Cliente
function main() {
    const vendingMachine: VendingMachine = new VendingMachine();

    vendingMachine.insertMoney();
    vendingMachine.selectBeverage();
    vendingMachine.dispense();
    
    vendingMachine.insertMoney();
    vendingMachine.ejectMoney();
    
    vendingMachine.selectBeverage();
    vendingMachine.insertMoney();
    vendingMachine.selectBeverage();
    vendingMachine.dispense();
}

// Ejecutar el cliente
main();