# Java
## Variables
Donde se pueden guardar datos

```
int numero = 10;
boolean tomaCafe = false;
double decimal = 2,5;
String nombre = "Juan";
```

```
int num1 = 2;
int num2 = 3;
int result = num1 + num2;

System.out.println("Resultado: ") + result;
```
## Sentencia IF
```
if (10 > 5) {
    System.out.println("Si");
} else {
    System.out.println("No");
}
```
## Bucle FOR
Repetir lo que esta dentro del bloque:
```
for (int i=0; i <= 10; i++) {
    System.out.println("Mensaje");
}
```

## Ciclo WHILE
Mientras se cumpla lo que esta dentro de la primera decisión, ejecutara lo que este dentro del bloque:
```
while (1 > 0) {
    System.out.println("Hola");
} 
```

## Ciclo DO WHILE
Igual al anterior, pero primero ejecuta lo que esta dentro del bloque y si se cumple la condición repite el proceso:
```
do {
    System.out.println("Hola");
} while (1 > 0);
```
## Arreglos - Arrays
Son un conjunto de variables que pueden ser enteros, decimales o de cadena:
```
int [] numeros = new int [4];

numeros[0] = 3;
numeros[1] = 4;
numeros[2] = 8;
numeros[3] = 9;
```
## Funciones
Es crear un bloque de código, le pones un nombre a ese código y despues puedes llevarlo desde donde tu quieras sin necesidad de volverlo a escribir el código:
```
public static void saludar() {
    System.out.println("Hola");
}

// Invocar la función
saludar(); // Ejecuta en consola lo que esta dentro de su bloque
```
