// Clase que representa el editor de texto
class TextEditor {
    private text: string = "";

    write(content: string): void {
        this.text += content;
    }

    getContent(): string {
        return this.text;
    }

    save(): Memento {
        return new Memento(this.text);
    }

    restore(memento: Memento): void {
        this.text = memento.getSavedState();
    }
}

// Clase Memento que almacena el estado del editor de texto
class Memento {
    private state: string;

    constructor(state: string) {
        this.state = state;
    }

    getSavedState(): string {
        return this.state;
    }
}

// Cliente
function main() {
    // Crear el editor de texto
    const editor: TextEditor = new TextEditor();

    // Escribir contenido
    editor.write("Primera línea\n");
    editor.write("Segunda línea\n");

    // Guardar el estado actual
    const memento: Memento = editor.save();

    // Escribir más contenido
    editor.write("Tercera línea\n");

    // Restaurar al estado anterior
    editor.restore(memento);

    // Obtener y mostrar el contenido restaurado
    console.log("Contenido restaurado:\n" + 
    editor.getContent());
}

// Ejecutar el cliente
main();