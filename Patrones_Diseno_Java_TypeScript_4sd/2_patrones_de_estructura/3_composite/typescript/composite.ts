// Interfaz Component que representa tanto elementos hoja como elementos compuestos
interface Component {
    render(): void;
}

// Implementación concreta para elementos hoja (por ejemplo, texto)
class MyText implements Component {
    private content: string;

    constructor(content: string) {
        this.content = content;
    }

    render(): void {
        console.log("Texto: " + this.content);
    }
}

// Implementación concreta para elementos compuestos (por ejemplo, documentos)
class MyDocument implements Component {
    private components: Component[] = [];

    addComponent(component: Component): void {
        this.components.push(component);
    }

    render(): void {
        console.log("Documento:");
        for (const component of this.components) {
            component.render();
        }
    }
}

// Crear elementos hoja (texto)
const heading: Component = new MyText("Título del documento");
const paragraph: Component = new MyText("Este es un párrafo de texto.");

// Crear un documento compuesto que contiene texto y elementos gráficos
const doc: MyDocument = new MyDocument();
doc.addComponent(heading);
doc.addComponent(paragraph);

// Renderizar el documento
doc.render();


