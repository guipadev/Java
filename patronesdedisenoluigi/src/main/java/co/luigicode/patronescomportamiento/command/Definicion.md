# Pátron de Comportamiento - Command

Petición que realiza un objeto a otro, esa petición se va a encapsular en un objeto,
es decir esa petición va ser opaca.

El objeto que realiza la petición, no sabe que parametros lleva. De hecho no sabe ni siquiera
a que otro objeto le esta realizando la petición.

## Ejemplo analogia empresa

Receptor - Un dev que programa código
Comandos - que serian las clases qu implementan la interfaz que seria los jefes intermedios project manager
Mediador o invoquer - que seria el jefe absoluto que manda sobre los comandos, dile al programador que realice
x función
Cliente - Contrata o habla con el Jefe(Mediado) cuanto me cobra por esta funcionalidad o proyecto

Comando que serian los jefes

## Ejemplo juego

mover al player hacia adelante, atras, lados y que salte

Receptor
Clase que realiza el trabajo

Comandos
Mandan
