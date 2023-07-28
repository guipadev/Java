package co.guipadev.MathRandom;

/**
 Cómo usar Math.random en Java con límites superior e inferior

 Puede ajustar math.random en java para obtener un número aleatorio (entero o decimal), dentro del rango deseado.

 La fórmula para un doble in aleatorio [lowerLimit, upperLimit)es la siguiente:

 resultado = límiteinferior + Math.random() * (límitesuperior - límiteinferior)

 Expliquemos la fórmula:

 Establecemos el límite inferior ya que queremos que el número mínimo que se generará sea igual al límite inferior.

 Entonces queremos configurar el upperLimit. Dado que el Math.random()método devuelve un número en [0,1), si multiplicamos
 este número por un factor del upperLimitnúmero, entonces es posible obtener un número mayor que el lowerLimit ya que
 lowerLimitmás upperLimites mayor o igual que el upperLimit.
 La solución a esto es restar el lowerLimit, y luego multiplicarlo por Math.random().

 Si desea encontrar un número entero aleatorio dentro del intervalo [lowerLimit, upperLimit], la fórmula es la siguiente:

 resultado = (int) (límiteinferior + Math.random() * (límitesuperior - límiteinferior + 1))
 */
public class RandomWithLowerUpper {
    public static void main(String[] args) {

        // Obtener un número aleatorio entre 1 y un número menor a 100
        double a = 1 + Math.random()*(100 - 1);
        System.out.println(a);

        // Obtenga un número aleatorio entre 42.5 y un número menor a 57.2
        double b = 42.5 + Math.random()*(57.2 - 42.5);

        // imprime el resultado
        System.out.println(b);

        //El límite inferior y superior se puede ajustar de acuerdo con la siguiente fórmula:
        // double x = lowerLimit + Math.random()*(upperLimit - lowerLimit) devuelve un número en [lowerLimit, upperLimit)
        double lowerLimit = 1000;
        double upperLimit = 1100;
        System.out.printf("A random double in [%f, %f) : %f \n",lowerLimit,upperLimit,getRandomDoubleExclusive(lowerLimit,upperLimit));
        System.out.printf("A random integer in [%f, %f) : %d \n",lowerLimit,upperLimit,getRandomIntExclusive(lowerLimit,upperLimit));

        // Para incluir el límite superior de números enteros, la fórmula es:
        // int x = límiteinferior + Math.random()*(límitesuperior - límiteinferior + 1) devuelve un número en [límiteinferior, límitesuperior]
        lowerLimit = 1340;
        upperLimit = 1350;

        System.out.printf("A random integer in [%f, %f] : %d \n",lowerLimit,upperLimit,getRandomIntInclusive(lowerLimit,upperLimit));

    }

    public static double getRandomDoubleExclusive(double lowerLimit, double upperLimit){
        return lowerLimit + Math.random() * (upperLimit - lowerLimit);
    }

    public static int getRandomIntExclusive(double lowerLimit, double upperLimit){
        return (int)(lowerLimit + Math.random() * (upperLimit - lowerLimit));
    }

    public static int getRandomIntInclusive(double lowerLimit, double upperLimit){
        return (int)(lowerLimit + Math.random() * (upperLimit - lowerLimit + 1));
    }

}
