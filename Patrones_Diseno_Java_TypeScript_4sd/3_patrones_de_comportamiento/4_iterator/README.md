## Iterator

El patrón Iterator es un patrón de diseño de comportamiento que se utiliza para proporcionar una forma uniforme de acceder secuencialmente a los elementos de una colección de objetos sin exponer los detalles de su implementación subyacente. En otras palabras, el patrón Iterator permite que los clientes recorran los elementos de una colección sin necesidad de conocer la estructura interna de dicha colección.

Características clave del patrón Iterator:

**Separación de preocupaciones:** Permite separar la lógica de acceso a los elementos de la colección de la lógica de la propia colección. Esto mejora la modularidad y el mantenimiento del código.

**Interfaz común:** Define una interfaz común para todos los iteradores, lo que facilita su uso y permite a los clientes recorrer diferentes tipos de colecciones de manera uniforme.

**Encapsulación de la colección:** Permite encapsular los detalles de implementación de la colección, como si es un arreglo, una lista enlazada u otra estructura, ocultándolos al cliente.

**Recorrido secuencial:** Proporciona un mecanismo para recorrer los elementos de la colección secuencialmente, avanzando de uno en uno.

Un ejemplo común de uso del patrón Iterator en Java es a través de la clase Iterator que forma parte del Framework de Colecciones de Java (java.util). Esta clase abstracta define métodos como hasNext() y next() que permiten a los clientes recorrer colecciones como listas, conjuntos y mapas de manera uniforme.

En este ejemplo, crearemos una colección de libros y utilizaremos un iterador para recorrerlos.




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
      3. En la carpeta TypeScript, ejecuta `tsc iterator.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node iterator.js` para ver el resultado del ejemplo.
