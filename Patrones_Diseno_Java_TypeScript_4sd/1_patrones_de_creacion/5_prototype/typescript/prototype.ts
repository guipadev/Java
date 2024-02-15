// Interfaz del prototipo
interface MyDocument {
    cloneDocument(): MyDocument;
    setContent(content: string): void;
    getContent(): string;
}

// Clase concreta del prototipo para documentos de texto
class TextDocument implements MyDocument {
    private content: string = "";

    cloneDocument(): MyDocument {
        const clonedDocument = new TextDocument();
        clonedDocument.setContent(this.content);
        return clonedDocument;
    }

    
    setContent(content: string): void {
        this.content = content;
    }

    getContent(): string {
        return this.content;
    }
}

// Clase concreta de prototipo para documentos de imagen
class ImageDocument implements MyDocument {
    private content: string = "";

    cloneDocument(): MyDocument {
        const clonedDocument = new ImageDocument();
        clonedDocument.setContent(this.content);
        return clonedDocument;
    }

    setContent(content: string): void {
        this.content = content;
    }

    getContent(): string {
        return this.content;
    }
}

// Código principal
const textDocument: MyDocument = new TextDocument();
textDocument.setContent("Este es un documento de texto.");
const clonedTextDocument: MyDocument = textDocument.cloneDocument();

console.log("Contenido del documento original:", textDocument.getContent());
console.log("Contenido del documento clonado:", clonedTextDocument.getContent());

const imageDocument: MyDocument = new ImageDocument();
imageDocument.setContent("Este es un documento de imagen.");
const clonedImageDocument: MyDocument = imageDocument.cloneDocument();

console.log("Contenido de la imagen original:", imageDocument.getContent());
console.log("Contenido de la imagen clonada:", clonedImageDocument.getContent());