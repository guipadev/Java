## Facade

El patrón Facade es un patrón de diseño estructural que proporciona una interfaz simplificada para un conjunto de interfaces más complejas en un subsistema. Actúa como un punto de entrada único para interactuar con el subsistema, ocultando la complejidad y detalles de implementación de las clases individuales que lo componen.

En otras palabras, el patrón Facade se utiliza para simplificar la interacción con un conjunto de clases o componentes que forman un subsistema más grande. Proporciona una capa de abstracción que facilita que los clientes utilicen el subsistema sin necesidad de conocer los detalles internos de cómo funciona.

El objetivo principal del patrón Facade es simplificar y desacoplar el código del cliente del código del subsistema, lo que mejora la mantenibilidad y la legibilidad del código. Además, proporciona un punto de entrada único y cohesivo para interactuar con el subsistema, lo que facilita el uso del subsistema en una aplicación más grande.

Para este ejemplo vamos a suponer que estamos desarrollando una aplicación de procesamiento de pedidos en línea para una tienda en línea. La aplicación tiene varios subsistemas y complejidades, como el manejo de inventario, el procesamiento de pagos y el envío de pedidos. El patrón Facade se utilizará para simplificar la interacción del cliente con estos subsistemas.

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
      3. En la carpeta TypeScript, ejecuta `tsc facade.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node facade.js` para ver el resultado del ejemplo.
