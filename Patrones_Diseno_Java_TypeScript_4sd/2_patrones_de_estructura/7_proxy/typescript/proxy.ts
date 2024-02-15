// Interfaz para representar un documento en el servidor remoto
interface MyFile {
    download(): void;
}

// Implementación concreta de un documento real en el servidor
class RealFile implements MyFile {
    private filename: string;
    private downloaded: boolean = false;

    constructor(filename: string) {
        this.filename = filename;
    }

    download(): void {
        if (!this.downloaded) {
            console.log(`Descargando archivo ${this.filename} desde el servidor remoto.`);
            this.downloaded = true;
        } else {
            console.log(`El archivo ${this.filename} ya ha sido descargado.`);
        }
    }
}

// Proxy que controla el acceso a los documentos y descarga bajo demanda
class FileProxy implements MyFile {
    private realFile: RealFile | null = null;
    private filename: string;

    constructor(filename: string) {
        this.filename = filename;
    }

    download(): void {
        if (!this.realFile) {
            this.realFile = new 
            RealFile(this.filename);
        }
        this.realFile.download();
    }
}

const file1: MyFile = new FileProxy("documento1.pdf");
const file2: MyFile = new FileProxy("documento2.doc");
// Descargamos el primer documento (se descargará desde el servidor)
file1.download();
file1.download();
// Descargamos el segundo documento (ya se descargó antes)
file2.download();
file2.download();
