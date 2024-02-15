## Builder

El patrón de diseño Builder es un patrón creacional que separa la construcción de un objeto complejo de su representación, permitiendo crear diferentes representaciones utilizando el mismo proceso de construcción. Este patrón se utiliza cuando el proceso de construcción de un objeto es complejo y puede involucrar múltiples pasos o configuraciones opcionales.

El patrón Builder define una interfaz abstracta (el Builder) que declara métodos para construir las partes individuales del objeto y un método para obtener el resultado final. Luego, se crean clases concretas (los ConcreteBuilders) que implementan esa interfaz y proporcionan implementaciones específicas para construir las partes. Además, se puede tener una clase Director opcional que controla el orden y el flujo de construcción utilizando un objeto Builder.

Este patrón es útil cuando se necesita crear objetos con configuraciones complejas y se desea evitar la proliferación de constructores con múltiples parámetros o combinaciones de métodos. El Builder facilita la construcción paso a paso, permitiendo ajustar y personalizar cada parte del objeto antes de obtener el resultado final.

En este caso el ejemplo supone que estamos construyendo un sistema de generación de informes y necesitamos construir informes complejos con diferentes secciones, como encabezado, cuerpo y pie de página.

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
      3. En la carpeta TypeScript, ejecuta `tsc builder.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node builder.js` para ver el resultado del ejemplo.
