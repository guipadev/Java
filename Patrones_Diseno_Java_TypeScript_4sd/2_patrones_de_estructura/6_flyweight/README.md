## Flyweight

Flyweight es un patrón de diseño estructural que se utiliza para minimizar el uso de memoria o recursos compartiendo de manera eficiente, instancias comunes y compartidas de objetos similares. En lugar de crear una instancia única para cada objeto similar, el patrón Flyweight permite compartir una sola instancia, lo que ahorra recursos y mejora el rendimiento.

Este patrón se basa en la idea de dividir un objeto en dos partes: la parte intrínseca, que contiene el estado compartido y no cambia entre objetos, y la parte extrínseca, que contiene el estado específico y puede variar entre objetos. Al compartir la parte intrínseca, múltiples objetos pueden referenciarla, lo que reduce significativamente la cantidad de memoria utilizada.

El patrón Flyweight es especialmente útil cuando se trabaja con una gran cantidad de objetos similares y se busca optimizar la eficiencia de memoria y rendimiento de una aplicación.

Un ejemplo del patrón Flyweight en Java podría ser en el contexto de una aplicación de procesamiento de texto, donde se utilizan muchos caracteres individuales, pero queremos ahorrar memoria almacenando solo una instancia de cada carácter.


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
      3. En la carpeta TypeScript, ejecuta `tsc flyweight.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node flyweight.js` para ver el resultado del ejemplo.
