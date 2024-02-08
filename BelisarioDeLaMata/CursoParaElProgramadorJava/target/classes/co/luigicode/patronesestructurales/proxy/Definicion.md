# Patron Estructural Proxy
Consiste en tener una copia de un objeto cuyo acceso es complicado o difícil, 
esa dificulta o complicación puede ser por varios motivos, por eso puede haber como 3 tipos de proxy:
1. Proxy de protección: 
    Es decir que hay un objeto de uso y acceso restringido, esta securizado, lo que hacemos es tener una copia
    de ese objeto virtual, el usuario o cliente trabaja con esa copia, y a la hora de actualizarla o cambiarla
    es cuando se va a tener en cuenta las restricciones de seguridad y se va a limitar el guardado o actualización. 
2. Proxy remoto:
    Hay un objeto que no es muy pesado a lo mejor, pero el acceso es complicado por problemas de tráfico o otras
    muchas causas y cada vez que quiero actuar sobre dicho objeto tendria que hacer un **request** y esperar la
    respuesta. Pues lo que hacemos obtenemos ese objeto en un solo **request** hacemos una copia y con esa copia
    se trabaja. Y en el momento haya que hacer un **commit* o actualizar es cuando llamariamos al servidor.
3. Proxy virtual:
   Es un objeto a lo mejor muy pesado o que esta guardado en disco y necesitamos estar constantemente accediendo
    a el escribiendolo, modificándolo y lo que hacemos en estos casos, es crear una copia de ese archivo.
   Trabajamos con ese objeto en memoria y una vez que vayamos a actualizarlo/guardarlo es cuando llamariamos al
    almacenamiento físico.
    Un ejemplo seria en una BD, por ejemplo uso JPA en Spring Boot, se utiliza un proxy para acceder la BD.

## Ejemplo código
Seguira con el ejemplo de un juego, entonces lo que es la partida la vamos a guardar en un fichero, y una vez
que actualice las estadísticas de la partida no voy a escribir en el fichero directamente, lo que se va hacer
es cargar una copia del objeto que está almacenado en fichero y ese objeto en memoria se va a modificando.
Cuando se realice un guardo en la partida, simplemente se agarra el objeto y se guarda en un archivo en el que
esta almacenado.