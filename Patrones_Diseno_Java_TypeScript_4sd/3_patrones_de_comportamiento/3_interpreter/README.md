## Interpreter

El patrón Interpreter es un patrón de diseño de comportamiento que se utiliza para definir una gramática para un lenguaje y proporcionar un intérprete que interpreta sentencias escritas en ese lenguaje. Este patrón se usa para convertir una expresión dada en un objeto que puede ser evaluado y produce un resultado.

**Gramática:** Define las reglas y la estructura del lenguaje que se desea interpretar. Puede ser una gramática formal o una estructura más flexible.

**Terminal y No Terminal:** En el contexto del patrón Interpreter, los elementos de la gramática se dividen en "terminales" (expresiones que no pueden ser divididas en partes más pequeñas) y "no terminales" (expresiones que pueden dividirse en partes más pequeñas).

**Expresión:** Cada regla gramatical se representa como una clase o interfaz de expresión. Las clases concretas implementan estas expresiones.

**Contexto:** Proporciona información de contexto que puede ser necesaria para la interpretación de las expresiones.

El patrón Interpreter es útil cuando se necesita evaluar expresiones complejas definidas por una gramática y es particularmente útil en lenguajes de consulta, sistemas de procesamiento de lenguaje natural, análisis sintáctico y otros escenarios donde se requiere interpretar o evaluar estructuras de datos complejas basadas en reglas específicas.

En este ejemplo, crearemos un intérprete que puede evaluar expresiones aritméticas básicas, como sumas y restas. La gramática será bastante limitada, pero ilustrará cómo se puede implementar el patrón Interpreter.


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
      3. En la carpeta TypeScript, ejecuta `tsc interpreter.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node interpreter.js` para ver el resultado del ejemplo.
