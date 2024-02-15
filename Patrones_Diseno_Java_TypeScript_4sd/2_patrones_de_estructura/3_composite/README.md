## Composite

El patrón Composite es un patrón de diseño estructural que permite componer objetos en estructuras de árbol para representar jerarquías de parte-todo. Permite a los clientes tratar tanto a los objetos individuales como a las composiciones de objetos de manera uniforme.

En otras palabras, el patrón Composite se utiliza cuando tienes objetos que pueden ser componentes individuales o conjuntos de esos componentes. Los objetos individuales y los conjuntos se tratan de la misma manera, lo que permite construir estructuras jerárquicas complejas de manera eficiente y uniforme.

Este patrón es útil cuando necesitas representar estructuras jerárquicas como árboles, donde un nodo puede ser tanto una hoja (objeto individual) como un nodo interno (un conjunto de nodos). El patrón Composite facilita la creación y manipulación de estas estructuras, ya que los clientes no necesitan conocer la diferencia entre los objetos individuales y los compuestos.

En este caso el ejemplo supone que estamos construyendo una aplicación de manejo de documentos donde los documentos pueden contener tanto texto como elementos gráficos como imágenes.

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
      3. En la carpeta TypeScript, ejecuta `tsc composite.ts` (reemplaza "nombrearchivo" por el nombre real del archivo TypeScript que deseas compilar).
      4. Esto generará un archivo JavaScript correspondiente.
      5. Finalmente, ejecuta el archivo JavaScript con Node.js usando `node composite.js` para ver el resultado del ejemplo.
