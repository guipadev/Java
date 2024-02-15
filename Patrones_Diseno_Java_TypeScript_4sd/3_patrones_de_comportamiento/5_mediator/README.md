## Mediator

El patrón Mediator es un patrón de diseño de comportamiento que se utiliza para reducir las dependencias complejas y no deseadas entre objetos en un sistema. Proporciona un punto centralizado (el mediador) a través del cual los objetos pueden comunicarse entre sí sin conocerse directamente. En otras palabras, el mediador actúa como un intermediario que coordina las interacciones entre objetos, evitando que los objetos se comuniquen directamente entre ellos.

El patrón Mediator es especialmente útil en sistemas donde un conjunto de objetos interactúa de manera compleja y se desea evitar un alto nivel de acoplamiento entre ellos. Ejemplos comunes de uso del patrón Mediator incluyen sistemas de chat, sistemas de control de tráfico aéreo, sistemas de gestión de eventos y sistemas de componentes de interfaz de usuario.

En resumen, el patrón Mediator proporciona una forma de gestionar las comunicaciones entre objetos de manera centralizada y desacoplada, lo que contribuye a la modularidad y la facilidad de mantenimiento del código.

Esta vez en el ejemplo, crearemos un sistema de chat en el que los usuarios se comunican a través de un mediador.

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
      3. En la carpeta TypeScript, ejecuta `tsc mediator.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node mediator.js` para ver el resultado del ejemplo.
