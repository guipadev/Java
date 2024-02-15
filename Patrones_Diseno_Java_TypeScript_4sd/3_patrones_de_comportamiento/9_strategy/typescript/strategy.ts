// Interfaz para representar un filtro de imagen
interface ImageFilter {
    apply(fileName: string): void;
}

// Clase concreta que implementa un filtro de imagen en blanco y negro
class BlackAndWhiteFilter implements ImageFilter {
    apply(fileName: string): void {
        console.log(`Aplicando filtro blanco y negro a ${fileName}`);
    }
}

// Clase concreta que implementa un filtro de imagen sepia
class SepiaFilter implements ImageFilter {
    apply(fileName: string): void {
        console.log(`Aplicando filtro sepia a ${fileName}`);
    }
}

// Clase Contexto que utiliza un filtro para procesar una imagen
class ImageProcessor {
    private filter: ImageFilter;

    setFilter(filter: ImageFilter): void {
        this.filter = filter;
    }

    processImage(fileName: string): void {
        this.filter.apply(fileName);
    }
}

// Cliente
function main() {
    const imageProcessor = new ImageProcessor();

    // Aplicar el filtro en blanco y negro
    imageProcessor.setFilter(new 
    BlackAndWhiteFilter());
    imageProcessor.processImage("imagen1.jpg");

    // Cambiar al filtro sepia y aplicarlo
    imageProcessor.setFilter(new SepiaFilter());
    imageProcessor.processImage("imagen2.jpg");
}

// Ejecutar el cliente
main();