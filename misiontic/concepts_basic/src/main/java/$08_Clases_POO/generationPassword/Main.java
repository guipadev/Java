package $08_Clases_POO.generationPassword;

/**
 Crear la clase Contraseña que tenga como atributos Longitud (por defecto será 8) y Contraseña (String)
 El constructor debe recibir la longitud y generar una contraseña aleatoria con dicha longitud.
 La clase debe tener los siguientes métodos:
 esFuerte(): Devuelve un booleano si es fuerte o no. Una contraseña se considera fuerte si tiene al menos
 una mayúscula, una minúscula, y más de cinco números.
 cambiarContraseña(String nuevaContraseña): Cambiará la contraseña actual por la indicada en los parámetros.
 toString(): Devolverá toda la información del objeto en un String.
 **/
public class Main {
    public static void main(String[] args) {
        // Crear una contraseña aleatoria de longitud 10
        Password contraseña1 = new Password(10);
        System.out.println(contraseña1.toString());
        System.out.println("Es fuerte: " + contraseña1.esFuerte());

        // Cambiar la contraseña a una nueva
        contraseña1.cambiarContraseña("nuevaContraseña123");
        System.out.println(contraseña1.toString());
        System.out.println("Es fuerte: " + contraseña1.esFuerte());

        // Crear una contraseña aleatoria de longitud por defecto (8)
        Password contraseña2 = new Password();
        System.out.println(contraseña2.toString());
        System.out.println("Es fuerte: " + contraseña2.esFuerte());
    }
}
