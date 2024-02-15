## Prototype

El patrón de diseño Prototype es un patrón creacional que se utiliza para crear objetos duplicados (clones) de un objeto existente (prototipo) sin acoplar el código cliente a las clases concretas de esos objetos. Es decir, el patrón Prototype permite crear copias exactas de un objeto, lo que es útil cuando se desea crear nuevas instancias que comparten propiedades y comportamientos similares con una instancia original.

En lugar de utilizar constructores para crear objetos, el patrón Prototype utiliza un objeto prototipo como base para crear clones. Este enfoque es especialmente beneficioso cuando la creación de un objeto es costosa o compleja. El patrón Prototype define una interfaz común que debe ser implementada por las clases concretas de prototipos, y cada clase concreta proporciona su propia lógica de clonación.

En resumen, el patrón de diseño Prototype es útil cuando se necesita crear copias de objetos existentes de manera eficiente y flexible, permitiendo que las instancias nuevas compartan similitudes con el prototipo original mientras se mantienen independientes entre sí.

Este ejemplo simula que estamos construyendo un sistema de gestión de documentos y necesitamos crear copias exactas de documentos existentes.


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
      3. En la carpeta TypeScript, ejecuta `tsc prototype.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node prototype.js` para ver el resultado del ejemplo.
