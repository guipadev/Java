
public class SumaPoliformica {
    
    public SumaPoliformica(){}
    
    public  int Suma(int n1, int n2){
        return n1 + n2;
    }
    
    public  double Suma(double n1, double n2){
        return n1 + n2;
    }
    
    public static void main(String[] args){
        SumaPoliformica calculadora = new SumaPoliformica();
        System.out.println(calculadora.Suma(5.7, 3.3)); //Depende del dato ingresado realiza la operacion con la funcion int o double
    }
}
