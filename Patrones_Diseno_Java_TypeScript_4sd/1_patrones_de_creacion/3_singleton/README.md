## Singleton

El patrón de diseño Singleton es un patrón creacional que garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia. Esto significa que, independientemente de cuántas veces se solicite crear una instancia de la clase, siempre se devolverá la misma instancia única.

En resumen, el Singleton se utiliza para asegurarse de que una clase tenga una sola instancia en toda la aplicación y proporcionar una forma de acceder a esa instancia desde cualquier punto del código. Esto es especialmente útil en situaciones en las que necesitas una única fuente de verdad o cuando deseas limitar el número de instancias de una clase por razones de control, rendimiento o coherencia.

El ejemplo supone que estamos construyendo una aplicación de registro de eventos y necesitamos una clase para manejar la configuración del registro. Queremos asegurarnos de que solo haya una instancia de esta clase en todo el sistema.
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
      3. En la carpeta TypeScript, ejecuta `tsc singleton.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node singleton.js` para ver el resultado del ejemplo.
