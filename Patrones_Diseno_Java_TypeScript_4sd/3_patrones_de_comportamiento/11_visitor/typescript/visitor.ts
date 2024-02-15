// Interfaz que define un elemento de documento
interface DocumentElement {
    accept(visitor: DocumentVisitor): void;
}

// Implementación concreta de un elemento de párrafo
class ParagraphElement implements DocumentElement {
    accept(visitor: DocumentVisitor): void {
        visitor.visitParagraph(this);
    }
}

// Implementación concreta de un elemento de encabezado
class HeaderElement implements DocumentElement {
    accept(visitor: DocumentVisitor): void {
        visitor.visitHeader(this);
    }
}

// Interfaz que define las operaciones del visitante
interface DocumentVisitor {
    visitParagraph(paragraph: ParagraphElement): 
    void;
    visitHeader(header: HeaderElement): void;
}

//Implementación concreta de un visitante que realiza operaciones en el documento
class DocumentProcessor implements DocumentVisitor {
    visitParagraph(paragraph: ParagraphElement): 
    void {
        console.log("Procesando un párrafo");
    }

    visitHeader(header: HeaderElement): void {
        console.log("Procesando un encabezado");
    }
}

// Cliente
function main() {
    const elements: DocumentElement[] = [
      new ParagraphElement(), 
      new HeaderElement()
    ];
    const visitor: DocumentVisitor = 
    new DocumentProcessor();

    for (const element of elements) {
        element.accept(visitor);
    }
}

// Ejecutar el cliente
main();