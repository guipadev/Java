interface Media {
    getDescription(): string;
}

// Implementaciones concretas de elementos multimedia
class MyImage implements Media {
    getDescription() {
        return "Esto es una imagen.";
    }
}

class Video implements Media {
    getDescription() {
        return "Esto es un video.";
    }
}

abstract class MediaFactory {
    abstract createMedia(): Media;
}

class ImageFactory extends MediaFactory {
    createMedia() {
        return new MyImage();
    }
}

class VideoFactory extends MediaFactory {
    createMedia() {
        return new Video();
    }
}

// Creamos una fábrica de imágenes y creamos un elemento multimedia
const imageFactory: MediaFactory = new ImageFactory();
const image: Media = imageFactory.createMedia();
console.log(image.getDescription()); 

// Creamos una fábrica de videos y creamos un elemento multimedia
const videoFactory: MediaFactory = new VideoFactory();
const video: Media = videoFactory.createMedia();
console.log(video.getDescription()); 

