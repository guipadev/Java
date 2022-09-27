package usoFinal;

public class main {

    public static void main(String[] args) {

        // No permite que se asigne un nuevo valor
        final int diasDelAno = 365;

        EjemploClase ejemploClase = new EjemploClase();
        ejemploClase.ejemploMetodo(2);

        // Uso de clase inmutable
        UserDto userDto = new UserDto("Ricardo", "Romero", 10);
        // esto no se puede modificar: userDto.setAge(10);
    }
}
