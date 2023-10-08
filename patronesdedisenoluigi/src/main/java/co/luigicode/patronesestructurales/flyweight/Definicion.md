# Patron Flyweigth

Busca que los objetos sean livianos, tratar de ahorra memoria al máximo

## Ejemplo
Una persona alquila un cuarto en vez del piso completo por el precio, pero va llegando una nueva persona 
y va instalando una lavadora, al final hay cuatro personas por piso con 4 lavadoras,
por ende el piso al ser pequeño hay menos espacio, el consumo aumenta en la energia y el ruido.

Solución tener una lavadora para los cuatros y turnarse para lavar la ropa.

## Ejemplo uso
Entonces en el patron los objetos van a compartir unos atributos en común, entonces en vez de que esos
objetos tenga esos atributos en si, creamos una clase que tenga esos atributos, y esa clase una instancia
la van a compartir las otras instancias.

## Ejemplo BD
Tenemos una BD para guardar videos, entonces tenemos el usuario y el video, aqui se tiene nombre, apellido,
número de documento, email, y luego información del video, titulo, descripción, fecha creación etc...
En caso que hubiera un video de por usuario seria corto, pero lo normal es que cada usuario pueda subir más
de un video, incluso que sea ilimitado.

Digamos que un usuario a subido 2000 videos, pues todos esos campos de usuario, apellido y todo lo démas
se repetiria 2000 veces. Lo cual es ineficiente.

Entonces creo una tabla usuario y guardo toda la información del usuario. Y en la tabla video tendra solo la
información del video con un campo que apunte a la tabla de usuario, por medio clave foranea.