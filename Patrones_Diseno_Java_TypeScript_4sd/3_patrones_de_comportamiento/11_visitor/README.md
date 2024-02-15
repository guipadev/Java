## Visitor

El patrón de diseño Visitor es un patrón de diseño de comportamiento que permite agregar nuevas operaciones o funcionalidades a un conjunto de objetos sin modificar su estructura. Permite que un objeto visite (recorra) los objetos de otro conjunto de objetos y realice una operación específica en cada uno de ellos, de manera independiente de la estructura de la clase del objeto visitado.

Es decir, el patrón Visitor permite extender las funcionalidades de un conjunto de objetos sin modificar su estructura, promoviendo así el principio de Open/Closed (abierto/cerrado) de diseño, donde una clase debe estar abierta para su extensión pero cerrada para su modificación. Esto lo convierte en una herramienta valiosa para la construcción de sistemas flexibles y mantenibles.

Para tratar de crear un ejemplo claro y realista consideremos un sistema de procesamiento de documentos que necesita realizar operaciones específicas en diferentes tipos de elementos de documento, como párrafos y encabezados.

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
      3. En la carpeta TypeScript, ejecuta `tsc visitor.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node visitor.js` para ver el resultado del ejemplo.
