# POO

## Qué es Maven ?

- **Maven** es una herramienta de software para la **gestión y construcción de proyectos Java** que se caracteiza por tener un modelo de configuración muy simple, basado en el formato **XML**.
- **Maven** utiliza el conocido archivo **POM.xml** (Proyect Object Model) para dentro de él especificar las diferentes **dependencias o librerías*** que serán necesarias incluir en el proyecto que se esté desarrollando.
- Algunos ejemplo de IDEs que ya incluyen Maven como opción en la creación de proyectos son:
	- Intellij IDEA
	- Netbeans

## Existe otros gestores de proyectos para Java?

- Si, **Gradle** es una herramienta **muy similar** a Maven.
- Sebasa en conceptos similares a Maven, pero con la particularidad de que fue diseñado principalmente para **realizar trabajos multiproyecto** o que requieran de **gran grado de personalización.**
- En lugar de utilizar XML(como lo hace Maven) utiliza **DSL (Lenguaje especifico de dominio)**

## Qué es un Paradigma

- Un **paradigma** es todo aquel modelo, patrón o ejemplo que debo seguir en determinada situación.
- En un sentido amplio, se refiere a una teoría o conjunto de teorías que sirve de modelo a seguir para resolver problemas o situaciones determinadas que se planteen.

## Paradigrma Orientado a Objetos

- El paradigma de programación orientada a objetos es la implementación de un paradigma de programación.
- La POO se basa en la idea de un mundo lleno de objetos y que la resolución de problemas se realiza mediante el modelado/abstracción de objetos de la vida real.
- Los objetos puede comunicarse entre si mediante mensajes.

## Programación Orientada a Objetos

- Se basa en el concepto de agrupar código y datos juntos dentro de una misma unidad llamada **clase**.
- Sus principales características son:
	- Abastracción
	- Encapsulamiento
	- Polimorfismo
	- Herencia
	- UML

## Clases

- Es una plantilla, o molde que permite construir objetos. **Por ejemplo, si tuviéramos la clase Auto, ésta sería el plano para construir el Objeto (En este cso uno o varios autos)**.
- Representa "entidades" del mundo real.
- Posee atributos y métodos.
- No pueden ser utilizadas directamente (sino mediante instancias a objetos).
- **Ejemplos**: Auto, Persona, Departamento, Factura, Recibo, Producto, etc.

## Métodos

- Las operacione o métodos son acciones contenidas en una clase, y definen su comportamiento.
- Dentro de un sistema, las operacione suelen detectarse como **verbos**.
- Desde la perspectiva de DIseño y Programación, se denominan **Métodos**.
- Desde la perspectiva de Análisis, se denominan **Operaciones**.
- Puede tener opcionalmente valores de entrada (Parámetros) y valores de salida (Valores de Retorno).
- Pueden existir **Procedimientos** (no retornan un valor) y **Funciones** (retornan un valor).

## Objetos

- Un objeto es una **instancia de una clase**.
- Es la representación de un objeto que generalmente existe en la vida real.
- Posee un **estado** (de acuerdo a sus atributos).
- Posee un **comportamiento** (realizan operaciones de acuerdo a sus métodos).


|		Alumno 		|		|	a1: Alumno		|
|-------------------|		|-------------------|
| - apellido: string|	→  	| apellido = Sanchez|
| - nombre: string 	|   	| nombre = Mario    |

		   ↓

|	a3: Alumno 		|		|	a2: Alumno		|
|-------------------|		|-------------------|
| apellido = Suarez |	    | apellido = Perez	|
| nombre = Daniela	|   	| nombre = Juan     |

## Constructores

- Son funciones especiales que contienen la clases para _permitir la creación de objetos_.
- Pueden recibir datos/párametros como no (constructor vacío).
- Se llaman SIEMPRE igual que la clase.
- No retorna NINGÚN VALOR (ni siquiera VOID).
- Generalmente se utilizan dos tipos de constructores
	- Constructor vacío.
	- Constructo con todos los parámetros.

## Herencia

- Hay clases que comparten gran parte de sus características.
- El mecanismo conocido con el nombre de herencia permite reutilizar clases: Se crea una nueva clase que extiende la funcionalidad de una clase existente sin tener que reescribir el código asociado a esta última.
- La nueva clase, a la que se denomina **subclase**, puede poseer atributos y métodos que no existan en la clase original.
- Los objetos de la nueva clase _heredan los atributos y los métodos de la clase original_, que se denomina **superclase**.

**Persona** es una clase genérica que sirve para almacenar datos en común de todas las personas, como el nombre, la dirección, el número de teléfono, etc.

**Empleado** hereda estos mismo atributos de la clase Persona, pero puede incluir atributos propios, como por ejemplo, num de legajo, puesto, cargo, etc.

**Consultor** también hereda los mismo atributos en común de la clase persona, mientras que puede incluir otro atributos propios, como empresa COnsultora, id de consultor, etc.

## Polimorfismo

**Clase Padre**
Vehiculo

**Clases Hijas o derivadas**
Coche
Moto
Bus

**Declaro la función:**
function estacionar (vehiculo) { }

**Invoco la función: (soportoo polimorfismo)**
estacionar(coche);
estacionar(Moto);
estacionar(Bus);

## Encapsulamiento

- **Encapsulamiento:** Significa reunir a todos los elementos que pueden considerarse pertenecientes a una misma entidad, al mismo nivel de abstracción. No se debe confundir con el Principio  de Ocultación.
- **Principio de Ocultación:** Cada objeto está aislado y únicamente expone una interfa a otros objetos donde especifica cómo pueden interactuar con él. El aislamiento protege a las propiedades de un objeto contra su modificación por quien no tenga derecho a accceder a ellas.
- El **encapsulamiento** permite 3 niveles de acceso:
	- PUBLIC (Público)
	- PRIVATE (Privado)
	- PROTECTED (Protegido)
	- DEFAULT ()

## Clases Abstractas

- Son un **tipo particular de clase** cuya principal característica es que **no pueden ser instanciadas**.
- Generalmente _declara la existencia de métodos pero no su implementación_, convirtiéndola así en una **clase padre**.
- Al menos **uno** de sus **métodos** debe ser **abstracto** (puede tener métodos no abstractos).
- Sus niveles de visualizació debe ser o **public** o **protected (nunca private)**.
- Cuando se usan clases abstractas una clase **no puede heredar de varias clase abstractas a la vez** (como es el caso de las interfaces).
- Generalmente las clase abstractas indicarn el "ES/SER" de un objeto.

## Cuándo se usan las Clases Abstractas ?

- Cuando deseamos definir **una abstracción** que englobe objetos de distintos tipos y queremos hacer uso del **polimorfismo**. Por ejemplo:
	- **Figura** es una **clase abstracta** porque no tiene sentido calcular su área, pero sí la de sus hijos (cuadrado o círculo).
	- Si una subclase de Figura (cuadrado o círculo) no redefine el método calcularArea(), deberá declararse también como clase abstracta.

|		Figura 		|		|	Circulo		 |
|-------------------|		|----------------|
| - posicionX		|	→  	| - posicionX	 |
| - posicionY	 	|   	| - posicionY    |
|-------------------|		| - radio		 |
| + calcularArea()	|		|----------------|
		   ↓				|+ calcularArea()|

|		Cuadrado	|
|-------------------|
| - posicionX		|
| - posicionY	 	|
| - lado 			|
|-------------------|
| + calcularArea()	|

## Interfaces

- Son una **colección de métodos abstractos*** con propiedades (atributos) **CONSTANTES**.
- Una interfaz **solamente puede extender o implementar otras interfaces** (la cantidad que quiera).
- Da a conocer **qué se debe hacer** (métodos) **pero sin mostrar su implementación** (Solo puede tener métodos abstractos).
- Solo puede tener **métodos** con **acceso público** (no pueden ser protected o private).
- Solo puede tener "variables" public static final (osea constantes).
- La palabra **abstract** en la definición de métodos _no es obligatoria_.
- Generalmente la interfaces indican el **"PUEDE HACER"** de un objeto.

## Ejemplo Interfaces

- Si no fuese necesario conocer la ubicación de una figura (x,y), se prodría eliminar por completo los atributos y convertir a Figura en una **interfaz**.
- **Figura** nos da ahora métodos que toda las figuras pueden tener; mientras que **rotable** y **dibujable** métodos que solo algunas pueden implementar.
- No se utiliza la palabra **extends** si no la palabra **implements**.

|	Rotable	|	|	Figura 		  |		|	Dibujable	|
|-----------|	|-----------------|		|---------------|
| 			|   |     			  |		|				|
|-----------|	|-----------------|		|---------------|
| + rotar()	|	| + calcularArea()|		| + dibujar()	|

	↑		↑		↑			↑			↑

|	Circulo		  |			|		Cuadrado	|
|-----------------|			|-------------------|
| - radio         |			| - lado 			|
|-----------------|			---------------------
| + calcularArea()|			| + calcularArea()	|
| + dibujar()	  |			| + dibujar()	  	|
| + rotar()		  |


## Qué son las collections ?

- Las **colecciones** son estructuras **similares a los arreglos** pero con la principal caracteristica de que son **dinámicos** (su tamaño y cantidad de elementos puede variar con el tiempo).

- En **Java**, las colecciones se emplean mediante la **interfaz "Collection"**, que permite implementar una serie de métodos comunes como ser: Añadir, Eliminar, Obtener el tamaño de la colección, etc.

### Tipos principales de Collections
- LIST
- SET
- QUEUE
- MAP

### Tipos principales de Collections

								|I Collection  |
								|--------------|

					↑					↑				   ↑
				|I List	|	|A Abstract Collection|		|I Set|
				|-------|   |---------------------|		|-----|
						↑		↑				↑		↑
					|AbastractList|				|A AbastractSet|
					|-------------|				|--------------|
					↑			↑					↑		↑
|A AbstractSequentialList|	|C ArrayList|		|C HashSet|	|C TreeHashSet|
|------------------------|	|-----------|		|---------|	|-------------|
		↑											↑
|C LinkedList|									|C LinkedHashSet|
|------------|									|---------------|



								|I Map |
								|------|

									↑
							|A AbstractMap |
							|--------------|
							↑			↑
					|C HashMap |	|C TreeHashMap|
					|----------|	|-------------|
						↑
				|C LinkedHashMap|
				|---------------|

## LIST (LISTAS)

- Las **listas** son un *conjunto de elementos relacionados entre si* que tienen un determinado *orden*.
- Su *tamaño es dinámico* (puede cambiar en el tiempo)
- En Java existen diferentes tipos de Lista:
	- ArrayLists
	- LinkedList
	- Stack

### ArrayList

- Es una **clase** que se representa como una **matriz dinámica** que permite almacenar elementos.
- Hereda de la clase **AbstractList**, la cual implementa la **interfaz List**.
- Permite **colecciones** o **elementos duplicados**.
- El **orden** de los registros es el **orden en que fueron insertados**.
- Permitir **acceso aleatorio** (tiene índice).
- Manipulación **lenta** (recorrer todo el arraylist para hacer un cambio).

### LinkedList

- Es una **clase**.
- Representa a una **lista doblemente enlazada** (ida y vuelta).
- Permite **duplicados**.
- Mantiene el **orden de inserción**.
- Manipulación más rápida.
- Puede ser usada/tratada no solo como **lista**, sino también como **pila**, o como **cola*.
- Permite hacer _inserciones o eliminiaciones_ al **principio** o al **final** de la colección (por eso es que puede ser tratado como una pila o una cola).

### Funcionamiento de Lista

| Lista | → | Luisina | ← | Juan | ← | Ibra |
|-------|   |---------| → |------| → |------|

### ArrayList vs LinkedList

### Linked List
| null | ← | 2 | ← | 23 | ← | a | ← | dd | ← | 7a | → | null |
|------|   |---| → |----| → |---| → |----| → |----|	  |------|
            head 							  tall

### Array

| 2 | 23 | a | dd | 7a |
|---|----|---|----|----|
	0	 1 	 2 	  3    4

## Como se elimina ?

### LinkedList
				 _______Borra Juan_______
				↓						 |
| Lista | → | Luisina | ← | Juan | ← | Ibra |
|-------|   |---------| → |------| → |------|
				|___________↑___________↑
							|
						Ubicación

### ArrayList

Initial ArrayLists| 10| 20 | 30| 1  | 2  |
				  |---|----|---|----|----|
					0	 1 	 2 	  3    4
					↑____↑___↑____↑____↑___ Index


remove (index)	| 10|  | 30| 1 | 2 |	During in between call
remove(1)		|---|--|---|---|---|
				  0	  1  2 	 3   4

				| 10| 30| 1 | 2 |		After call
				|---|---|---|---|
				  0	  1   2   3

## MAP

- Un **Map** es un colección de pares **clave-valor** donde **cada clave** está asociada a un **único valor**.
- **Map** en Java **no puede contener claves duplicadas**.
- Permite acceso rápido a los valores a través de las claves.
- Java proporciona _diferentes implementaciones_ de Map:
    - HashMap
    - TreeMap
    - LinkedHashMap
    - entre otras...

### Métodos de Map
- La interfaz Map tiene una serie de métodos que podemos utilizar, veamos algunos de los más utilizados:
    - **put (C clave, V valor)**: AGregar un par clave-valor a la collection Map.
    - **get (OBject clave)**: Devuelve el valor asociado a la clave brindad o null si la clave no existe.
    - **constainsKey (Object clave)**: Verifica si el Map contiene la clave especificada.
    - **constainsValue (Object valor)**: Comprueba si el Map contiene el valor especificado.
    - **remove (OBject clave)**: Elimina el registro asociado a la clave brindada.
    - **keySet()**: Devuelve un conjunto de todas las claves en el Map.
    - **values()**: Devuelve una colección de todos los valores que contiene el Map.

## Qué son las excepciones ?

- Una **excepción** es un evento que ocurre durante la ejecucción de un programa que rompe el flujo normal de ejecucción.
- Cuando se habla de excepciones nos referimos  a un **evento excepcional** (algo muy difícil que pase o fuera de lo común).

### Qué cosas causan excepciones ?

- Muchas cosas pueden causar excepciones, entre ellos:
	- Errores hardware
	- Operaciones matemáticas no posibles (Ej: dividir por cero)
	- Errores de programa (Ej: error de desbordamiento de un arreglo)
	- Apertura de un archivo inexistente
	- Entre otras...

## Tipos de Excepciones

- Hay dos tipos bien diferenciados:
	- Propias de Java como lenguaje
	- Personalizadas

### Excepciones Propias de Java

									| 	 Object	   |
									|--------------|
										   ↑
										   |
									| 	Throwable  |
									|--------------|
					 ______________________↑___________________________
					|												   |
				 | Error |										| Exception |
				 |-------|   									|-----------|
		 ____________↑______________			 		 ______________↑____________
		|			 |				|					|							|
| OutOfMemoryError | | | StackOverflowError |	| RuntimeException|			| IOException |
|------------------| | |--------------------|	|-----------------|			|-------------|
					 |									↑						  ↑
		 ____________|				 ___________________|___________              |______________
		|							|			 |					|             |              |
| LinkageError | 	| IllegalArgumentException | |	| IndexOutOfBoundsException | |	| FileNotFoundException |
|--------------|	|--------------------------| |	|---------------------------| |	|-----------------------|
								    ↑			 |				  	↑			  |
		     _______________________|	 ________|					|			  |_____________
			|							|							|							|
| NumberFormatException |	| ArithmeticException |	| ArrayIndexOutOfBoundsException |	| SocketException |
|-----------------------|	|---------------------|	|--------------------------------|	|-----------------|

### Excepciones Personalizadas

- Para poder construir excepciones propias, hay que tener en cuenta los siguientes bloques:
	- **try:** Bloque donde puede ocurrir la excepción.
	- **catch:** Es como el "else" del try (se ejecuta al dispararse una excepción en el bloque try)
	- **finally:** Bloque de código que se ejecuta siempre (sin importar si hbieron errores o no)
	- **throw:** Lanzar una excepción cualquiera
	- **throws:** Determinar qué excepciones puede lanzar un método

## Relaciones entre clases

- **1 a 1** Un objeto de una clase puede relacionarse SOLO con uno de otras
- **1 a N** Un objeto de una clase puede relacionarse con muchos de otras
- **N a 1** La inversa de 1 a n _mismo tipo de relación pero cambia el sentido_
- **N a N** Muchos objetos de una clase pueden relacionarse con muchos de otras

## Enum (Enumeraciones)
- En Java,**enum** es una palabra clave utilizada para definir un tipo de dato especial que representa un **conjunto fijo de constantes**.
- Estas constantes son valores predefinidos que representan elementos distintos de un conjunto.

```
enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
```

```
enum TipoDeVehiculo {
    AUTOMOVIL, MOTOCICLETA, CAMIONETA, BICICLETA
}
```
