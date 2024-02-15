## Proxy

El patrón Proxy es un patrón de diseño estructural que proporciona un sustituto o representante de otro objeto para controlar el acceso a él. El proxy actúa como una capa intermedia entre el cliente y el objeto real, permitiendo realizar tareas adicionales, como la carga bajo demanda, la verificación de permisos, el registro de acceso, entre otros, sin que el cliente sea consciente de ello.

En resumen, el patrón Proxy se utiliza para agregar una capa de control y funcionalidad adicional a un objeto sin modificar su estructura ni afectar su uso normal. Esto es particularmente útil en situaciones en las que se necesita un control adicional sobre el acceso o el comportamiento de un objeto, como la gestión de recursos costosos, la seguridad, la auditoría o la carga bajo demanda de recursos. El proxy permite al cliente interactuar con el objeto de la misma manera que lo haría con el objeto real, pero con funcionalidades adicionales proporcionadas por el proxy.

Para el ejemplo supongamos que estamos construyendo una aplicación de gestión de documentos en una empresa, y necesitamos implementar un sistema que permita a los empleados acceder a documentos almacenados en un servidor remoto de manera eficiente. Cada documento puede ser bastante grande, y no queremos descargarlos todos de inmediato debido a la limitación de ancho de banda y el espacio de almacenamiento en las máquinas locales de los empleados. En cambio, deseamos descargar documentos sólo cuando un empleado solicita un documento en particular.

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
      3. En la carpeta TypeScript, ejecuta `tsc proxy.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node proxy.js` para ver el resultado del ejemplo.
