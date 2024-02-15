## Observer

El patrón Observador, también conocido como el patrón de Publicador-Suscriptor o el patrón Sujeto-Observador, es un patrón de diseño de comportamiento que define una relación de uno a muchos entre objetos. En este patrón, un objeto, llamado sujeto, mantiene una lista de observadores que dependen de él para ser notificados y actualizados automáticamente cuando cambia su estado. Cuando el sujeto cambia su estado, notifica a todos sus observadores, lo que les permite reaccionar y tomar acciones específicas.

Las características clave del patrón Observador son:

**Desacoplamiento:** Permite que el sujeto y los observadores funcionen de manera independiente, sin necesidad de conocer los detalles internos del otro. Esto promueve la modularidad y el bajo acoplamiento en el diseño de software.

**Notificación automática:** Los observadores se actualizan automáticamente cuando el sujeto cambia su estado, eliminando la necesidad de que los observadores verifiquen activamente el estado del sujeto.

**Extensibilidad:** Puedes agregar o quitar observadores fácilmente sin modificar el sujeto, lo que hace que el patrón sea flexible y escalable.

El patrón Observador se usa comúnmente en situaciones en las que varios objetos necesitan estar informados y actuar en función de los cambios en el estado de otro objeto. Ejemplos típicos de uso incluyen sistemas de eventos en interfaces de usuario, sistemas de notificación en aplicaciones de mensajería, y sistemas de seguimiento de cambios en datos en tiempo real.

Esta vez en el ejemplo crearemos un sistema simple de seguimiento de stock, donde los observadores (inversores) recibirán actualizaciones cuando el precio de una acción cambie.


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
      3. En la carpeta TypeScript, ejecuta `tsc observer.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node observer.js` para ver el resultado del ejemplo.
