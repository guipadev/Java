## Template Method

El método Template Method, es un patrón de diseño de comportamiento, que proporciona una estructura para definir un algoritmo en una superclase, pero permite que las subclases reemplacen o extiendan ciertos pasos del algoritmo sin cambiar su estructura general. En otras palabras, el patrón Template Method define un esqueleto de algoritmo en una clase base, pero permite que las subclases personalicen partes específicas del algoritmo según sea necesario.

En este caso para el ejemplo vamos a crear un pequeño framework de juegos que tiene un método de plantilla para el ciclo de vida de un juego, permitiendo a los desarrolladores crear juegos específicos que heredan de este framework y personalizar ciertos aspectos del juego según sus necesidades.


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
      3. En la carpeta TypeScript, ejecuta `tsc template_method.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node template_method.js` para ver el resultado del ejemplo.
