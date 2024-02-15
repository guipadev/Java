## Chain of Responsibility

El patrón Chain of Responsibility es un patrón de diseño de comportamiento que se utiliza para crear una cadena de objetos (manejadores) en la que cada objeto en la cadena tiene la capacidad de procesar una solicitud o pasarla al siguiente objeto en la cadena.

En otras palabras, cuando llega una solicitud, cada objeto en la cadena decide si puede manejarla o si debe pasar al siguiente objeto en la cadena. Esto permite que múltiples objetos tengan la oportunidad de procesar la solicitud, y el proceso de manejo puede ser flexible y escalable. Si un objeto en la cadena puede manejar la solicitud, lo hace; de lo contrario, la pasa al siguiente objeto.

El patrón Chain of Responsibility se utiliza comúnmente en situaciones donde se requiere un procesamiento secuencial de solicitudes y donde se necesita desacoplar el remitente de la solicitud de sus receptores. Cada manejador en la cadena puede tener reglas específicas para procesar la solicitud y decidir si la maneja o la delega. Este patrón promueve la reutilización y permite agregar o eliminar fácilmente manejadores sin afectar el flujo general de procesamiento de solicitudes.

Para este ejemplo vamos a suponer que tienes una serie de empleados en una empresa, y cada empleado tiene un límite de autorización para aprobar gastos. La solicitud de compra debe pasar por una cadena de empleados hasta que alguien con la autoridad adecuada la apruebe.


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
      3. En la carpeta TypeScript, ejecuta `tsc chain_of_responsability.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node chain_of_responsability.js` para ver el resultado del ejemplo.
