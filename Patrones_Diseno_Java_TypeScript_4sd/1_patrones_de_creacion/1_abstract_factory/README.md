## Abstract Factory

Debido a que es un patrón del tipo creacional ya sabemos que tipo de problemas nos puede ayudar a resolver, este patrón básicamente nos permite trabajar con objetos de distintas familias, evitando que se mezclen entre sí pero teniendo claro que su objetivo es que estos objetos puedan trabajar juntos, vamos a plantear un ejemplo simple.

El ejemplo que encontrarás aquí se trata de un juego de rol (RPG) y necesitamos crear diferentes tipos de personajes y armas.

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
      3. En la carpeta TypeScript, ejecuta `tsc abstract_factory.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node abstract_factory.js` para ver el resultado del ejemplo.
