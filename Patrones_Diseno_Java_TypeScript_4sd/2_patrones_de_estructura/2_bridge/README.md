## Bridge

El patrón Bridge es un patrón de diseño estructural que separa una abstracción de su implementación, de modo que ambas puedan variar de manera independiente. Esto significa que las clases abstractas (abstracciones) y las clases concretas (implementaciones) son independientes y pueden ser extendidas sin depender una de la otra.

En esencia, el patrón Bridge promueve la composición sobre la herencia, permitiendo que las abstracciones y las implementaciones evolucionen de manera independiente. Esto es especialmente útil cuando tienes múltiples dimensiones de variación en tu sistema y deseas evitar una explosión combinatoria de subclases.

En resumen, el patrón Bridge permite que una abstracción y su implementación varíen por separado, lo que facilita la creación de estructuras flexibles y mantenibles en un sistema de software.

El ejemplo en este caso supone que estamos desarrollando un sistema de entretenimiento que puede mostrar películas y series de televisión en diferentes tipos de dispositivos: televisores y proyectores. Además, queremos admitir diferentes plataformas de contenido, como Netflix y Amazon Prime. El patrón Bridge nos ayudará a separar las abstracciones (contenido) de sus implementaciones (dispositivos y plataformas de contenido), lo que facilitará la extensión de ambas de manera independiente.



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
      3. En la carpeta TypeScript, ejecuta `tsc bridge.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node bridge.js` para ver el resultado del ejemplo.
