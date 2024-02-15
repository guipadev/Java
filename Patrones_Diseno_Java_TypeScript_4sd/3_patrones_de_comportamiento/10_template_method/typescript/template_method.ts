abstract class Game {
    abstract initialize(): void;
    abstract startPlay(): void;
    abstract endPlay(): void;
    play(): void {
        this.initialize();
        this.startPlay();
        this.endPlay();
    }
}

// Subclase que implementa un juego de ajedrez
class Chess extends Game {
    initialize(): void {
        console.log("Inicializando el juego de ajedrez");
    }

    startPlay(): void {
        console.log("Comenzando el juego de ajedrez");
    }

    endPlay(): void {
        console.log("Terminando el juego de ajedrez");
    }
}

// Subclase que implementa un juego de Monopoly
class Monopoly extends Game {
    initialize(): void {
        console.log("Inicializando el juego de Monopoly");
    }

    startPlay(): void {
        console.log("Comenzando el juego de Monopoly");
    }

    endPlay(): void {
        console.log("Terminando el juego de Monopoly");
    }
}

function main() {
    console.log("Jugando al ajedrez:");
    const chessGame = new Chess();
    chessGame.play();

    console.log("Jugando al Monopoly:");
    const monopolyGame = new Monopoly();
    monopolyGame.play();
}
main();