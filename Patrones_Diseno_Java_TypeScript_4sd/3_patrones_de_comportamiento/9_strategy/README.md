## Strategy

El patrón Strategy, que también se conoce como el patrón de estrategia, es un patrón de diseño de comportamiento que permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Este patrón permite que el cliente elija el algoritmo concreto que debe utilizarse en tiempo de ejecución sin cambiar la estructura del código.

En otras palabras, el patrón Strategy desacopla el comportamiento de un objeto del objeto en sí mismo. Esto se logra mediante la definición de una interfaz o una clase abstracta que representa una estrategia (un conjunto de acciones) y la implementación de varias clases concretas que representan diferentes versiones o variantes de esa estrategia. El objeto que utiliza la estrategia (el contexto) tiene un miembro que apunta a una instancia de la estrategia y delega la ejecución de las acciones a esa estrategia.

Es decir, el patrón Strategy permite que el comportamiento de un objeto sea modular, extensible y configurable, lo que facilita la incorporación de nuevas estrategias sin afectar al código existente y permite que el cliente seleccione dinámicamente la estrategia adecuada en tiempo de ejecución. Este patrón es útil en situaciones donde varias alternativas de algoritmos o comportamientos son aplicables y se deben intercambiar o seleccionar en función de la situación.

Para este ejemplo, crearemos un simulador simple de una aplicación de procesamiento de imágenes que permite aplicar diferentes filtros a una imagen.


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
      3. En la carpeta TypeScript, ejecuta `tsc strategy.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node strategy.js` para ver el resultado del ejemplo.
