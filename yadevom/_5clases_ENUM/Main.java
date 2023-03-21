package usoEnum;

public class Main {

    public static void main(String[] args) {


        // Ejemplo problemas a resolver
        int lunes = 1;
        int martes = 2;
        int miercoles = 3;
        int diaDeLaSemana = 1;

        if (lunes == diaDeLaSemana) {

        } else if (martes == diaDeLaSemana) {

        } else if (miercoles == diaDeLaSemana) {

        } else {}

        // Uso del ENUM para resolver dicho caso
        DiaDeLaSemana ayer = DiaDeLaSemana.SABADO;

        switch (ayer) {
            case LUNES:
                System.out.println("Ayer fue lunes");
                break;
            case MARTES:
                System.out.println("Ayer fue martes");
                break;
            case MIERCOLES:
                System.out.println("Ayer fue miercoles");
                break;
            case JUEVES:
                System.out.println("Ayer fue jueves");
                break;
            case VIERNES:
                System.out.println("Ayer fue viernes");
                break;
            case SABADO:
                System.out.println("Ayer fue sabado");
                break;
            case DOMINGO:
                System.out.println("Ayer fue domingo");
                break;
        }

        // Podemos recorrer el enum dia con el for
        for (DiaDeLaSemana value : DiaDeLaSemana.values()) {
            System.out.println("Hoy es " + value);
        }

        // ENUM extendido a conocer el ranking y evento del dia
        // Extendiendo el Enum
        int hoy = EnumDiaDeLaSemana.SABADO.ranking;
        System.out.println("El ranking del dìa de hoy es #" + hoy);

        String queHayPaHacer = EnumDiaDeLaSemana.SABADO.evento;
        System.out.println("El eveneto de hoy es: " + queHayPaHacer);
    }
}
