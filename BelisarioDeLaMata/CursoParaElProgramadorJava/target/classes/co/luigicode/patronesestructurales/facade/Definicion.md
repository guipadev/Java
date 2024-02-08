# Patron Facade - Fachada

## Ejemplo
Te levantas en la mañana, te duchas, te pones tu ropa y luego desayunar
FACADE: Con dar clic en un boton ya me hace todo el proceso y quedo listo para desayunar
Tenemos un monton de clases para realizar un procedimiento, para generar un archivo, para leerlo, cargarlo y editarlo
entonces creo muchas instancias de varias clases

Este pátron crea una clase que es como una clase esclava
Entonces solo invocamos esta clase esclava, le pasamos los parametros que necesita
Y ya esta clase se encarga de realizar todo el proceso

## Ejemplo código
Sera sobre un video juego, se implementara el tema de crafteo de crear armas y modificarlas