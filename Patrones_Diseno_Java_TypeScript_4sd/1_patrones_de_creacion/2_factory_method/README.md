## Factory Method

El Factory Method, es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una clase base, pero delega la responsabilidad de la creación a las subclases concretas. En otras palabras, el Factory Method define un método abstracto en una clase base que las subclases deben implementar para crear instancias de un objeto. Esto permite que las subclases elijan qué clase concreta de objeto crear, mientras que el código que utiliza estos objetos sigue siendo independiente de las clases concretas específicas.

Para este caso el ejemplo supone que estamos construyendo una aplicación de creación de contenido multimedia, y necesitamos un mecanismo para crear diferentes tipos de elementos multimedia, como imágenes y videos.

## Estructura del Repositorio

Este repositorio está organizado de la siguiente manera:

- **Carpeta de Patrón de Diseño**
  - **Java**: Contiene un proyecto Maven.
    - Para ejecutar el ejemplo Java, sigue estos pasos:
      1. Importa el proyecto en tu IDE favorito.
      2. Navega hasta el paquete `com.example.main` y encuentra la clase principal.
      3. Ejecuta la clase principal para ver el resultado del ejemplo.

  - **TypeScript**: Contiene archivos TypeScript.
    - Para ejecutar el ejemplo TypeScript, sigue estos pasos:
      1. Asegúrate de tener TypeScript instalado. Si no lo tienes, ejecuta `npm install -g typescript` para instalarlo globalmente.
      2. Si existe un archivo `package.json` en la carpeta, ejecuta `npm install` para instalar las dependencias del proyecto.
      3. En la carpeta TypeScript, ejecuta `tsc factory_method.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node factory_method.js` para ver el resultado del ejemplo.
