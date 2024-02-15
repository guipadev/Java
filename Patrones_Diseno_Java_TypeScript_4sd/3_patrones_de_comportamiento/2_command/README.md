## Command

El patrón Command es un patrón de diseño de comportamiento que se utiliza para encapsular una solicitud como un objeto. Esto permite que los clientes emitan solicitudes sin conocer los detalles de la operación que se realizará ni quién la llevará a cabo.

Es decir  el patrón Command convierte una solicitud o request en un objeto independiente que contiene toda la información necesaria para ejecutar esa solicitud en un momento posterior. Esto promueve la separación de la invocación de una acción de la implementación real de esa acción, lo que resulta en un diseño más flexible y extensible. Este patrón es especialmente útil cuando se necesita la capacidad de deshacer o rehacer acciones, o cuando se requiere el registro de solicitudes para su posterior ejecución o manipulación.

Hablando del ejemplo, supongamos que tienes un control remoto que debe manejar diferentes dispositivos electrónicos, como una televisión y una luz. Cada dispositivo tiene operaciones específicas, como encender, apagar y ajustar el volumen (en el caso de la televisión). Veamos cómo sería el código en Java para lograr esto utilizando el patrón Command.


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
      3. En la carpeta TypeScript, ejecuta `tsc command.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node command.js` para ver el resultado del ejemplo.
