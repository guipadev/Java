# Desbloqueo de clases selladas en Java: un nuevo enfoque para estructurar jerarquías de clases

Una de esas características introducidas en versiones recientes de Java 17 son las clases selladas. 
Las clases selladas brindan un mecanismo poderoso para controlar y definir la jerarquía de las subclases
dentro de una clase, brindando un nuevo nivel de control y precisión al diseño de clases.

## Comprender las clases selladas
En esencia, una clase sellada es una clase que restringe la jerarquía de sus subclases.  
En otras palabras, especifica explícitamente qué clases pueden extenderlo. 
Esto introduce un nivel de previsibilidad y control sobre la estructura de herencia, 
evitando que se creen subclases no autorizadas o no deseadas.

Las clases selladas son particularmente valiosas en escenarios en los que desea asegurarse de que ciertas 
clases tengan acceso exclusivo para extender una clase base. 
Al definir cuidadosamente las subclases permitidas, puede evitar los peligros potenciales de una jerarquía 
de clases amplia y no regulada.

## Beneficios de usar clases selladas
La adopción de clases selladas en Java trae una multitud de beneficios que contribuyen a una mejor organización 
y mantenibilidad del código:

**Previsibilidad de código mejorada:** 
las clases selladas eliminan la incertidumbre que puede surgir de un modelo de herencia abierto. 
Al especificar explícitamente qué subclases están permitidas, puede predecir y administrar con precisión 
las posibles extensiones de una clase. 
Esta previsibilidad mejora la estabilidad y confiabilidad general de su base de código.

**Capacidad de mantenimiento mejorada:** 
en bases de código grandes, administrar una jerarquía de clases extensa puede convertirse en un desafío. 
Las clases selladas agilizan este proceso al definir claramente las relaciones entre las clases. 
Esto facilita la comprensión de la arquitectura del código y facilita un mantenimiento y actualizaciones 
más eficientes.

**Control de acceso preciso:** 
las clases selladas ofrecen un enfoque detallado para el control de acceso. 
Puede controlar exactamente qué clases pueden extender una clase sellada, evitando extensiones no autorizadas. 
Este nivel de control ayuda a hacer cumplir los principios de diseño y las decisiones arquitectónicas.

**Reducción de fallas y errores:** 
la subclasificación no intencionada y no autorizada puede generar comportamientos y fallas inesperados. 
Las clases selladas mitigan este riesgo al restringir la jerarquía. 
Esta reducción de errores potenciales contribuye a una base de código más robusta y libre de errores.

## Declarar una clase sellada
Para declarar una clase sellada, usa el modificador Sealed antes de la palabra clave class. 
La palabra clave sellada restringe la herencia de la clase a un conjunto específico de subclases. 
Estas subclases se declaran explícitamente mediante la cláusula de permisos.

Aquí hay una sintaxis básica para declarar una clase sellada:

```
public sealed class Shape permits Circle, Square, Triangle {
    // Class members and methods
}
```

En este ejemplo, la **Shape** clase se declara como sellada y permite que las subclases **Circle**, **Square**
y **Triangle** la extiendan. 
Esto significa que ninguna otra clase puede extenderse **Shape** a menos que se especifique explícitamente 
en la **permits** cláusula.

## Ampliación de una clase sellada
Las subclases de una clase sellada deben declarar explícitamente su herencia utilizando la palabra clave extends 
y el nombre de la clase sellada que pretenden extender. 
Además, la subclase debe ser una de las subclases permitidas declaradas en la clase sellada.

Aquí hay un ejemplo de cómo extender una clase sellada:

```
public  final  class  Circle  extends  Shape { 
    // Miembros y métodos de la clase
 }
```

En este caso, la **Circle** clase extiende la clase sellada **Shape**, y dado que **Circle** es una de 
las subclases permitidas de **Shape**, esta extensión es válida.

## Beneficios de Clases Selladas en Declaración y Prórroga
Declarar y extender clases selladas ofrece varias ventajas:

1. Jerarquía clara
La cláusula de permisos proporciona una forma clara y concisa de definir las subclases permitidas. 
Esto ayuda a mantener una jerarquía de clases bien organizada.

2. Las clases selladas de diseño forzado hacen cumplir la decisión de diseño de permitir solo subclases 
específicas. Esto asegura que la jerarquía de clases se adhiera a la arquitectura prevista.

3. Legibilidad y documentación
Las clases selladas facilitan la comprensión de las relaciones entre clases. 
Los desarrolladores pueden identificar rápidamente qué subclases están permitidas, lo que lleva a una mejor
comprensión del código.

4. Prevención de extensiones no intencionadas
Las clases selladas previenen extensiones no intencionadas restringiendo las posibilidades de herencia. 
Esto contribuye a la estabilidad del código y reduce las posibilidades de introducir errores.

## Casos de uso del mundo real de clases selladas
Las clases selladas en Java ofrecen una forma versátil de modelar escenarios complejos y encapsular 
comportamientos dentro de jerarquías bien definidas. 
En esta sección, exploraremos casos prácticos de uso de clases selladas y demostraremos cómo se pueden 
emplear para resolver problemas del mundo real.

## Clases selladas frente a clases e interfaces abstractas
Java proporciona varios mecanismos para la herencia de clases, incluidas clases e interfaces abstractas. 
Las clases selladas introducen una nueva forma de administrar jerarquías de clases que ofrece claras ventajas 
sobre estos enfoques tradicionales.

### Comparación entre clases selladas y clases abstractas

### Clases selladas:

- Las clases selladas restringen la jerarquía de subclases que pueden extenderlas usando la **permits** palabra clave.
- Las subclases deben enumerarse explícitamente usando **permits** en la declaración de clase sellada.
- Esta restricción promueve un mejor control y encapsulación de la jerarquía de clases.
- Las clases selladas admiten una coincidencia de patrones exhaustiva, lo que garantiza un manejo completo 
de todas las subclases posibles.
- Diseñado para escenarios en los que un conjunto fijo de subclases debe controlarse estrictamente.

### Clases abstractas:

- Las clases abstractas proporcionan una clase base que puede incluir algunos métodos concretos y métodos abstractos.
- Las subclases pueden extender libremente la clase abstracta y anular sus métodos.
- Las clases abstractas permiten una jerarquía más abierta, lo que potencialmente conduce a una gama más amplia 
de subclases.
- Las clases abstractas son adecuadas para compartir código e implementar un comportamiento común entre clases 
relacionadas.

### Comparación entre Clases Selladas e Interfaces

### Clases selladas:

- Las clases selladas definen un conjunto cerrado de subclases usando permits, como una interfaz con un conjunto predefinido de clases de implementación.
- Las clases selladas pueden incluir métodos abstractos que cada subclase debe implementar.
- Las clases selladas proporcionan un equilibrio entre los contratos de tipo interfaz y la herencia de clases abstractas.
- Ofrecen más control sobre la jerarquía en comparación con las interfaces tradicionales.

### Interfaces:

- Las interfaces definen un contrato que pueden implementar varias clases.
- Las clases que implementan una interfaz pueden pertenecer a diferentes jerarquías de herencia.
- Las interfaces admiten herencia múltiple, lo que permite que una clase implemente múltiples interfaces.
- Las interfaces se utilizan a menudo para definir el comportamiento común entre clases no relacionadas.

## Cuándo usar clases selladas

Las clases selladas son particularmente útiles en escenarios donde:

- Desea un conjunto de subclases bien definido y controlado.
- La coincidencia exhaustiva de patrones es crucial para garantizar un manejo integral de las subclases.
- Desea lograr un equilibrio entre las restricciones de las clases selladas y la flexibilidad de las clases
o interfaces abstractas.
- Su diseño involucra un conjunto pequeño y predefinido de roles o estados que las subclases pueden representar.












