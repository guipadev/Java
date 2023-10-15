# Patrón de Comportamiento - Chain of Responsibility - Cadena de Responsabilidad

## Ejemplo
Trabajas como desarrollador de una empresa tu trabajas con el lenguaje Java 
y hay otros compañeros que trabajan con otros lenguajes de programación:

JAVA - PHP - C++ - RUST - PYTHON

Entonces llega un proyecto de un cliente y ese proyecto toca realizarlo en python, al yo trabajar con Java, se lo
paso a mi compañero del lado, ignoro en que lenguaje trabaja, pero es el programador de PHP, entonces este lo que hace
es pasarlo al siguiente compañero, ignorando igualmente que lenguaje usa, este como trabaja en C++, lo va a pasar al
siguiente que trabaja con Rust y este termina pasandolo al que trabaja con Python. 

Y este al recibirlo va a decir, si me toca hacerlo a mi, porque yo si trabajo con python.

## Ejemplo en código
Yo tengo una seria de objetos y están enlazados, seria como una lista y c/u tiene un siguiente. Y cada objeto se
especializa en resolver una tarea.

Le enviamos una tarea y el primero comprueba si es el encargado de hacerla en caso de ser afirmativo, la lleva a cabo,
en caso negativo se la envia al siguiente.

Puede llegar el caso que ningun objeto pueda llegar implementar la tarea, entonces indicamos que no se puede.

## Ejemplo código a desarrollar
Aplicaremos seguir con el ejemplo de los video juegos, digamos que nos enfrentamos a un enemigo mago, que detecta
la clase de jugador que se enfrenta, digamos que atacamos con una clase de jugador guerrero, entonces el mago detecta
ese tipo, y va hacer un ataque que realice más daño a los guerros y si es tipo mago, lanzar un ataque que haga más
daño a los magos.

