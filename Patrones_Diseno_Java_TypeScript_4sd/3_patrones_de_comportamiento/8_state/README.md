## State

El patrón State es un patrón de diseño de comportamiento que permite que un objeto altere su comportamiento cuando su estado interno cambia. Esto se logra representando cada estado posible como un objeto y delegando el comportamiento relacionado con el estado a estos objetos. El objeto "contexto" (que puede cambiar de estado) contiene una referencia a uno de los objetos de estado, lo que determina su comportamiento actual.

En resumen, el patrón State se utiliza para modelar comportamientos que dependen del estado interno de un objeto de manera que sea más fácil de entender y mantener, ya que cada estado es una clase separada que encapsula su propio comportamiento. Este patrón es especialmente útil cuando un objeto debe cambiar su comportamiento en función de múltiples estados diferentes, y permite que el objeto cambie de estado en tiempo de ejecución sin cambiar su interfaz.

Algunos beneficios clave del patrón State incluyen el aumento de la cohesión (cada estado se encuentra en su propia clase), la reducción del acoplamiento (el contexto no necesita conocer detalles de implementación de los estados) y la facilidad de agregar nuevos estados sin modificar el código existente.

Para el ejemplo crearemos un simulador simple de una máquina expendedora de bebidas que puede tener diferentes estados, como "Sin dinero", "Seleccionando bebida" y "Entregando bebida". Dependiendo del estado actual, la máquina responderá de manera diferente a las acciones del usuario.


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
      3. En la carpeta TypeScript, ejecuta `tsc state.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node state.js` para ver el resultado del ejemplo.
