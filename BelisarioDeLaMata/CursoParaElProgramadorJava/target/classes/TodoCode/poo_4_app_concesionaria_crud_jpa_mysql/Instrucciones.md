# Desafío

## Funcionalidad a realizar

Una tienda de venta de automóviles necesita de un sistema que le permita realizar un CRUD de todos los vehículos que tiene actualmente a la venta para luego publicarlos en un catálogo.

Realiza el modelado correspondiente de la clase Automovil teniendo en cuenta los siguientes datos:
id, model, marca, motor, color, patente(placa), cantidadPuertas.

Realizar los métodos necesarios para permitir las operaciones CRUD de cada automóvil.

IMPORTANTE:
Respetar el modelo de capas, separando la responsabilidad de cada una de ellas:
lógica, interfaz gráfica (en caso de realizarla) y persistencia.

## Query Creación BD

`CREATE SCHEMA automovil DEFAULT CHARACTER SET utf8 ;`

## Arquitectura

Monolitico en capas

IGU(Vista) -> Lógica -> Persistencia -> BD
IGU(Vista) <- Lógica <- Persistencia <- BD
