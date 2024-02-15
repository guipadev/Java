// Interfaz Command que define las operaciones comunes para los comandos
interface Command {
    execute(): void;
}

class Device {
    private name: string;

    constructor(name: string) {
        this.name = name;
    }

    turnOn(): void {
        console.log("Encendiendo " + this.name);
    }

    turnOff(): void {
        console.log("Apagando " + this.name);
    }
}

// Clase concreta que representa un comando para encender un dispositivo
class TurnOnCommand implements Command {
    private device: Device;

    constructor(device: Device) {
        this.device = device;
    }

    execute(): void {
        this.device.turnOn();
    }
}

// Clase concreta que representa un comando para apagar un dispositivo
class TurnOffCommand implements Command {
    private device: Device;

    constructor(device: Device) {
        this.device = device;
    }

    execute(): void {
        this.device.turnOff();
    }
}

// Clase concreta que representa un comando para ajustar el volumen de la televisión
class AdjustVolumeCommand implements Command {
    private television: Television;
    private volume: number;

    constructor(television: Television, volume: 
    number) {
        this.television = television;
        this.volume = volume;
    }

    execute(): void {
        this.television.adjustVolume(this.volume);
    }
}

// Clase que representa una televisión (receptor específico)
class Television extends Device {
    constructor(name: string) {
        super(name);
    }

    adjustVolume(volume: number): void {
        console.log("Ajustando el volumen de la televisión a " + volume);
    }
}

// Clase que representa el control remoto (invocador)
class RemoteControl {
    private command: Command | null = null;

    setCommand(command: Command): void {
        this.command = command;
    }

    pressButton(): void {
        if (this.command) {
            this.command.execute();
        }
    }
}

const tv = new Television("Televisión");
const light = new Device("Luz");

const turnOnTV = new TurnOnCommand(tv);
const turnOffTV = new TurnOffCommand(tv);
const adjustVolume = new AdjustVolumeCommand(tv, 20);
const turnOnLight = new TurnOnCommand(light);

const remote = new RemoteControl();
remote.setCommand(turnOnTV);
remote.pressButton();

remote.setCommand(adjustVolume);
remote.pressButton();

remote.setCommand(turnOffTV);
remote.pressButton();

remote.setCommand(turnOnLight);
remote.pressButton();