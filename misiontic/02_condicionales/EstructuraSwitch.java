package condicionales;

public class EstructuraSwitch {
    
    public static boolean esVocalMinuscula(char ch) {
        boolean value;
        switch (ch) {
            case 'a':
                value = true;
                break;
            case 'e':
                value = true;
                break;
            case 'i':
                value = true;
                break;
            case 'o':
                value = true;
                break;
            case 'u':
                value = true;
                break;
            default:
                value = false;
                break;
        }
        return value;
    }
    
    //Se puede agrupar
    public static boolean esVocalMinuscula2(char ch) {
        boolean value;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                value = true;
                break;
            default:
                value = false;
                break;
        }
        return value;
    }
    
    public static boolean esVocalMinuscula3(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

}
