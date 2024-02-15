## Adapter

El patrón de diseño Adapter es un patrón estructural que permite que objetos con interfaces incompatibles trabajen juntos. Este patrón se utiliza para adaptar la interfaz de una clase existente (llamada "Adaptado") a otra interfaz esperada por el cliente, permitiendo que ambos colaboren sin necesidad de modificar el código fuente original.

En otras palabras, el patrón Adapter actúa como un intermediario que traduce las llamadas y las operaciones del cliente a una forma que el objeto Adaptado pueda entender y manejar. Esto es especialmente útil cuando se integran componentes heredados o de terceros en un nuevo sistema, donde no se pueden o no se desean cambiar las interfaces existentes.

El patrón Adapter se compone principalmente de tres componentes:

**Cliente**: Es el código que necesita interactuar con el Adaptado, pero su interfaz es incompatible con la del Adaptado.


**Adaptado**: Es la clase existente que necesita ser adaptada para trabajar con el Cliente. Su interfaz es la que el Cliente no puede utilizar directamente.


**Adaptador**: Es la clase que implementa la interfaz esperada por el Cliente y se comunica con el Adaptado para realizar las operaciones necesarias.



En resumen, el patrón Adapter permite que objetos con interfaces diferentes trabajen juntos sin que el Cliente ni el Adaptado sean conscientes de la adaptación que ocurre detrás de escena. Esto fomenta la reutilización de código y la integración de componentes de manera más flexible en el diseño de software.

Para este ejemplo imagina que tienes un sistema que interactúa con varios servicios de pago, pero deseas unificar la interfaz para todos los servicios de pago independientemente de su implementación subyacente.

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
