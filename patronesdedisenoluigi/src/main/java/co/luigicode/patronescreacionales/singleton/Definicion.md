## Patron Creaciónal Singleton
Una instancia única

### Ejemplo:
Tenemos la Clase Usuario y ponemos:

Usuario pepe = new Usuario();
Usuario manolo = new Usuario();

Tenemos dos usuarios, osea dos instancias.

En Singleton al ser solo una isntancia, no se pueden crear si no solo un usuario.


Tiene el problema del multihilo. A veces considerado antipatron.