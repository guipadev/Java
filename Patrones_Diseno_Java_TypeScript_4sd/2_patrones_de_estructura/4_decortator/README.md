## Decorator

El patrón Decorator es un patrón de diseño estructural que permite agregar comportamiento adicional o responsabilidades a objetos individuales de manera dinámica, sin modificar su estructura. En otras palabras, el patrón Decorator se utiliza para extender la funcionalidad de una clase sin tener que crear subclases adicionales.

El patrón Decorator se basa en la composición en lugar de la herencia. Permite que los objetos sean decorados o envueltos por otros objetos que tienen la misma interfaz. Cada decorador agrega su propia funcionalidad al objeto original, y estos decoradores pueden apilarse en capas para proporcionar múltiples extensiones de comportamiento.

Este patrón es especialmente útil cuando tienes clases con un comportamiento base y deseas agregar opciones adicionales de manera flexible sin tener que crear una clase derivada para cada combinación posible. En resumen, el patrón Decorator permite la adición dinámica de responsabilidades a objetos, lo que lo hace versátil y fácil de extender.

Para este ejemplo vamos a suponer que estamos construyendo un sistema de cafetería donde tenemos diferentes tipos de café, y los clientes pueden personalizar su café agregando ingredientes adicionales como leche, caramelo, etc. Utilizaremos el patrón Decorator para modelar esto.


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
      3. En la carpeta TypeScript, ejecuta `tsc decorator.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node decorator.js` para ver el resultado del ejemplo.
