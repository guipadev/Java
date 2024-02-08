# MANEJO DE EXCEPCIONES EN JAVA: CÓMO UTILIZAR LAS PALABRAS CLAVE TRY, CATCH, FINALMENTE, THROW Y THROWS

## ¿Qué es una excepción en Java?
Una excepción, como su nombre indica, es un error que se produce cuando se produce un comportamiento inesperado . Es vital que siempre manejemos las posibles excepciones que puedan ocurrir, ya que podrían tener consecuencias catastróficas para nuestra aplicación.

## Excepciones marcadas y no marcadas en Java
Hay dos tipos de excepciones en Java, marcadas y no marcadas .

Una excepción marcada es cualquier excepción que sea reconocible en el momento de la compilación; como resultado, el compilador le exigirá que lo maneje para que la aplicación se compile correctamente.

Por otro lado, una excepción no comprobada es cualquier excepción que no es reconocible en tiempo de compilación y puede generarse durante el tiempo de ejecución. Tenga en cuenta que todas las excepciones no marcadas que no sean instancias o hijos de la clase Error ampliarán la clase RuntimeException .

Algunos ejemplos de excepciones marcadas son:
- ClassNotFoundException– Se produce cuando una aplicación intenta cargar una clase pero falta esta clase.
- IOException– Esto se produce cuando fallan las operaciones de E/S.
- FileNotFoundException– Esta es una clase secundaria IOExceptiony se genera cuando intentamos leer o escribir en un archivo que no se pudo encontrar.

En cuanto a las excepciones no comprobadas:
- NullPointerException– Esto se produce cuando intentamos acceder a un campo o llamar a un método de un objeto nulo.
- IndexOutOfBoundsException– Se produce cuando intentamos acceder a una colección proporcionando un índice que está fuera de rango.
- ArrayIndexOutOfBoundsException – Este es un caso más específico de la excepción anterior y se produce cuando intentamos acceder a una matriz proporcionando un índice que está fuera de rango.

## Clases de excepción UML

- Throwable : esta es la clase de más alto nivel y todas las excepciones y errores heredan de ella.
- Excepción : esta clase tiene como hijas todas las clases relacionadas con excepciones que se espera que sean manejadas mediante bloques try-catch.
- Error : Todas las clases que extienden la clase Error están relacionadas con errores que NO DEBEN ser manejados . Además, como puede inferir, todas estas clases se clasifican como excepciones no comprobadas.
- Finalmente, para el resto de clases, ya explicamos en la sección anterior cuál es la diferencia entre excepciones marcadas y no marcadas.