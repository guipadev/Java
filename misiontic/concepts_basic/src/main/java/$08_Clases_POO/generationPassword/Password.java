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


import java.util.Random;

public class Password {
    private int longitud;
    private String password;

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    private void generarPassword() {
        Random random = new Random();
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteres = letrasMayusculas + letrasMinusculas + numeros;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        password = sb.toString();
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        return mayusculas > 0 && minusculas > 0 && numeros > 5;
    }

    public void cambiarContraseña(String newPassword) {
        password = newPassword;
    }

    @Override
    public String toString() {
        return "Contraseña{" +
                "longitud=" + longitud +
                ", contraseña='" + password + '\'' +
                '}';
    }
}
