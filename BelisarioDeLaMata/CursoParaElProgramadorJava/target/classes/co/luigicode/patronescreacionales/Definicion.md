### Factory Simple
Se utiliza en el caso que tenga una Clase Padre y muchas Clases derivadas
Se utiliza para crear instancias de objetos y son objetos que hereda de una
Clase Padre y cuando tiene muchos Hijos.

### Ejemplo
Elementos de video juegos como enemigos, el jugador etc
Digamos tenemos muchos tipos de enemigos:
- Humanos
- Guerreros
- Magos
- Asesinos
- Animales 
- Criaturas

A la hora de crear un nuevo objeto vamos a utilizar el Factory

### Factory Método
Es prácticamente similar, con una pequeña diferencia en este caso el uso de una clase Padre Abstracta
- Desventaja
Implementar un monto de clases, interfaces y herencias, requiere conocimiento para aplicarlo de forma adecuada
- Ventaja
Conveniente para el cliente que lo utilice, comodisimo
Adecuado este uso de pátron cuando se crean bibliotecas / liberias que vamos a utilizar mucho
Esto facilita el uso enormemente 

### Factory Abstract
Hay una Clase Padre y muchas clases derivadas, se necesita a la hora de crear una instancia nueva
se usa a la hora de crear una instancia nueva
Cuando además de muchas instancias hay una familia, se refiere a objetos que a pesar de que son clases
distintas que vienen de una Clase Padre diferente, tienen en común algo, que formarian parte de un todo

### Builder
Tenemos una entidad que tiene varios atributos > 10, y algunos atributos son obligatorios y otros no,
entonces empezamos a crear varios constructores, incluyendo el vacío, y varias opciones de uso de parametros.
Pero si son más atributos, creamos demasiados constructores con muchas opciones de posibles variaciones de parametros.

- Inconveniente
Duplicar todas las clases   

- Ventaja
Es fácil de implementar, lombok lo trae para evitar escribir la duplicidad, y permite usar constructor de acuerdo
a los parametros que necesitemos

## Prototype
Objetivo hacer copias rápido y normalmente son unos tipos de objetos que se van a utilizar mucho y a ver
muchas instancias de esa Clase. Así que el proceso en este Patrón, es crear una instancia y esa instancia
luego la utilizamos para crear otras de una forma rápida, con el clone. Evitando estar poniendo todos los
parametros, ni llamados a los Setters.

Hacer copias de Objetos, de una forma rápida y eficiente para evitar escribir 1000 línes de código
Ejemplo de video juego
Tenemos varios enemigos genéricos, guerreros que aparecen por todos los niveles y mapas
Lo cual hacemos crea uno y los démas serian clones de ese, para ejecutar todo de una forma más rápida
Osea son enemigos genéricos, no son Jefes finales xD

- Desventaja
El problema que tiene el acceso a las variables que son de la Clase Padre que son de tipo Protected
