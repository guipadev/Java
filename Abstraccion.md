# Abstracción

## Qué es ?

Por ejemplo un gato, este es una idea compleja aunque no se crea. Y cuando existen ideas complejas se utiliza abstracciones para simplificar detalles que no nos pertenecen o nos importa en el momento.

Con las abstracciones vemos la realidad de forma simplificada, desde distintos puntos de vistas.

El gato se puede ver distintas abstracciones segun el contexto que se necesite:

Biogolo -> Mamífero
Persona -> Mascota
Otro Biologo -> Felino
Veterinario -> Vertebrado

## Abstracción Funcional

Gaby programo el siguiente método:

```
int alCuadrado(int x) {
	...
	...
	return x * 2;
}
```

Juan otro programdor que utilizar en una clase el método creado por Gaby.
Osea que Juan vera el método de Gaby a traves de su abstracción, más simple que es la firma del método, el cual es el nombre del método especificando los tipos de los parametros y el tipo de retorno hecho.

Gaby podria seguir mejorando el código, y Juan no se veria afectado, ya que si Gaby respeta la firma del método.

```
Class Calculadora {
	...
	...
	...
	int res = alCuadrado(20){
		...
		...
	}
	...
	...
	...
}
```

## Tipo de Dato Abstracto (TDA)

Ejemplo trabajando con fracción a/b. Pero la abstracción con la que trabajaremos no es simplemente la firma de un método, si no con la firma de un conjunto de métodos.

Como se puede ver vamos a tener multiples implementaciones, y no importa cual clase usemos, desde que respetemos la firma de los metodos. 

IMPLEMENTACIÓN		|		TDA (FUNCIONES)
					|
class Fraccion1 {	|		crearFraccion(a, b)
	....			|	
}					|		sumarFraccion(f1, f2)
					|
class Fraccion2 {	|		multiplicarFraccion(f1, f2)
	...				|
}					|
					|

## Polimorfismo (POO)

```
public class Juego {
	GatoDeCompañia gatito = new FabricaDeGatos().crear();

	gatito.alimentar(): // ignora la comida
	gatito.jugar();	// miau miau

	// En la clase principal no se cambia nada, solo en fabrica y obtenemos nuevos resultados
	gatito.alimentar(): // miau tengo hambre
	gatito.jugar();	// Ñom ñom
}
```

Al hacer un cambio en **FabricaDeGatos** ose de utilizar **GatoJugueton** por **GatoComilon** estos se realizan aquí, y no se toca el programa principal.
```
public class FabricaDeGatos {
	
	public GatoDeCompañia crear() {
		return new GatoJugueton();
	}

	// Si cambiamos la fabrica por GatoComilon
	public GatoDeCompañia crear() {
		return new GatoComilon();
	}	
}
```

**GatoJugueton** implementa de **GatoDeCompañia**
```
public class GatoJugueton implements GatoDeCompañia {
	
	@Override
	public void jugar(){
		System.out.println("miau miau");
	}

	@Override
	public void alimentar(){
		System.out.println("ingnorar la comida");
	}
}
```

**GatoComilon** aunque tambien implementa de **GatoDeCompañia** el retorno del método es diferente

```
public class GatoComilon implements GatoDeCompañia {
	
	@Override
	public void jugar(){
		System.out.println("miau tengo hambre");
	}

	@Override
	public void alimentar(){
		System.out.println("Ñom ñon");
	}
}
```

**GatoDeCompañia** es un interfaz
```
public interface GatoDeCompañia {
	void jugar();
	void alimentar();
}
```

## Conclusión
En los tres conceptos de abtraccion se repitio un patron, este patron consiste en una barrera de abstracción que separa la implementación del objeto o función que estamos utilizando, de forma que podamos realizar cambios a la implementación, sin afectar el código que estamos utilizando la función o el objeto.

## Los 4 Tipos de Datos Abstractos que todo Programador debe saber

