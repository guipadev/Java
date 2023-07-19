# Conceptos teoricos

## 1 a 1
Uno objeto de una clase puede relacionarse SOLO con uno de otra

## 1 a N
Un objeto de una clase puede relacionarse con muchos de otra

## N a 1
La inversa de 1 a N (mismo tipo de relación pero cambia el sentido)

## N a N
Muchos objetos de una clase pueden relacionarse con muchos de otra

## Qué es JPA ?

- **JPA** es un **ORM** (Object Relational Mapping) que tiene como objetivo lograr **la persistencia de datos** entre una aplicación desarrollada en Java y una base de datos.

- **JPA** busca **traducir el modelado de las clases Java** a **un modelo relacional en una base de datos**, posibilitando al programador elegir qué clase u objetos quiere persistir.

## Cómo funciona JPA ?

- **JPA** se vale de una serie de mapeos que se deben realizar sobre cada uno de los elementos de una clase, los mismos, se representan mediante **anotaciones(@)**.

- **JPA** cuenta con  **proveedores de JPA**, entre ellos: **Eclipselink, Hibernate, Toplink**, entre otros.

Aplicación Java	->	JPA + Proveedor de JPA	->	BD

## Que es ORM ?

- El **Mapeo Objeto-Relacional, ORM** en inglés, es una técnica utilizada para **convertir clases** (y sus relaciones) de un sistema que utiliza un **lenguaje de programación orientado a objetos** a el modelado de una **base de datos relacional**.

- **¿Cómo hace ORM este mapeo?** >> Mediante una serie de "indicaciones" que realizan utilizando un concepto llamado "**Anotacions**".

## Annotations más usadas

- **@Entity**: Especifica la creación de una entidad. Se coloca al inicio de la definición de una clase.
- **@Id**: Primary key de la entidad
	- @GeneratedValue(strategy=GenerationType.SEQUENCE): Establece que la ID se va a generar de forma automática y secuencial.
- **@Basic**: Para hacer referencia atributos comunes.
- **@Temporal**: Se usa normalmente en fechas.
	- Si quiere tener en cuenta la hora se utiliza: @Temporal(TemporalType.TIMESTAMP)
	- Si solo se tiene en cuenta la fecha (DATE): @Temporal(TemporalType.DATE)
- **@OneToMany**: Indicar una relación unidereccional del 1 a n.
- **@OneToOne**: Indicar una relación de 1 a 1.
- **@ManyToMany**: Indicar una relación n a n.


|		Alumno 			|				|	Carrera		 	|				
|-----------------------|				|-------------------|
| - int id;				|	--1 a 1 --	| - int id;		 	|
| - String nombre; 		|   			| - String nombre;  |
| - String apellido;	|				|-------------------|
| - Date fechaNac; 		|				| - getters			|
| - Carrera unaCarrera;	|				| - setters			|
|-----------------------|		
| - getters				|		
| - setters				|



|		Alumno 			|				|	Carrera		 						|				
|-----------------------|				|---------------------------------------|
| - int id;				|	--1 a 1 --	| - int id;		 						|
| - String nombre; 		|   			| - String nombre;  					|
| - String apellido;	|				| - LinkedList<Materia> listaMaterias;	|
| - Date fechaNac; 		|				|---------------------------------------|
| - Carrera unaCarrera;	|				| - getters								|
|-----------------------|				| - setters								|
| - getters				|							|		
| - setters				|						  1 a n
													↓
										|		Materia	 	|	
										|-------------------|
										| - int id;			|	
										| - String nombre;  |
										| - String tipo;	|	
										|-------------------|
										| - getters			|
										| - setters			|