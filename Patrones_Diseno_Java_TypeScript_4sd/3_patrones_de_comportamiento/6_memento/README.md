## Memento

El patrón Memento es un patrón de diseño de comportamiento que se utiliza para capturar y externalizar el estado interno de un objeto de manera que el objeto pueda ser restaurado a ese estado en un momento posterior sin revelar los detalles de su implementación interna.

Este patrón se suele usar cuando necesitas mantener un historial de cambios en un objeto o proporcionar la funcionalidad "deshacer" en una aplicación. El Memento permite que un objeto capture su estado actual y lo almacene en un objeto llamado "memento", que puede ser almacenado en una colección o incluso enviado a otro lugar. En un momento posterior, el objeto puede restaurar su estado anterior a partir del memento.

En el ejemplo vamos a simular un un sistema de editor de texto que permite al usuario escribir y guardar instantáneas (mementos) de su trabajo para restaurarlas más tarde.


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
      3. En la carpeta TypeScript, ejecuta `tsc memento.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node memento.js` para ver el resultado del ejemplo.
