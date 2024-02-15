interface Content {
    play(): void;
    pause(): void;
    stop(): void;
}

// Implementaciones concretas de las formas
class Movie implements Content {
    private title: string;

    constructor(title: string) {
        this.title = title;
    }

    play(): void {
        console.log("Reproduciendo la película: " + 
        this.title);
    }

    pause(): void {
        console.log("Pausando la película: " + 
        this.title);
    }

    stop(): void {
        console.log("Deteniendo la película: " + 
        this.title);
    }
}

class TVSeries implements Content {
    private title: string;

    
    constructor(title: string) {
        this.title = title;
    }

    play(): void {
        console.log("Reproduciendo la serie de TV:" 
        + this.title);
    }

    pause(): void {
        console.log("Pausando la serie de TV: " + 
        this.title);
    }

    stop(): void {
        console.log("Deteniendo la serie de TV: " + 
        this.title);
    }
}

// Interfaz para las implementaciones de dispositivos
interface Device {
    powerOn(): void;
    powerOff(): void;
    setChannel(channel: number): void;
}

// Implementaciones concretas de dispositivos
class Television implements Device {
    powerOn(): void {
        console.log("Encendiendo el televisor");
    }
    
    powerOff(): void {
        console.log("Apagando el televisor");
    }

    setChannel(channel: number): void {
        console.log("Cambiando al canal " + channel);
    }
}

class Projector implements Device {
    powerOn(): void {
        console.log("Encendiendo el proyector");
    }

    powerOff(): void {
        console.log("Apagando el proyector");
    }

    setChannel(channel: number): void {
        console.log("No se puede cambiar de canal en el proyector");
    }
}

/* Abstracción que une el contenido y los dispositivos */
abstract class EntertainmentDevice {
    protected content: Content;
    protected device: Device;

    constructor(content: Content, device: Device) {
        this.content = content;
        this.device = device;
    }

    abstract playContent(): void;
    abstract stopContent(): void;
}

// Implementación concreta que une películas con dispositivos
class MoviePlayer extends EntertainmentDevice {
    constructor(content: Content, device: Device) {
        super(content, device);
    }

    playContent(): void {
        this.device.powerOn();
        this.content.play();
    }

    stopContent(): void {
        this.content.stop();
        this.device.powerOff();
    }
}

// Implementación concreta que une series de TV con dispositivos
class TVSeriesPlayer extends EntertainmentDevice {
    constructor(content: Content, device: Device) {
        super(content, device);
    }

    playContent(): void {
        this.device.powerOn();
        this.content.play();
    }

    stopContent(): void {
        this.content.stop();
        this.device.powerOff();
    }
}

const movie: Content = new Movie("The Matrix");
const tvSeries: Content = new TVSeries("Breaking Bad");

const television: Device = new Television();
const projector: Device = new Projector();

const moviePlayer: EntertainmentDevice = new MoviePlayer(movie, television);
const tvSeriesPlayer: EntertainmentDevice = new TVSeriesPlayer(tvSeries, projector);

moviePlayer.playContent();
tvSeriesPlayer.playContent();

moviePlayer.stopContent();
tvSeriesPlayer.stopContent();
