import java.util.Scanner;


public class ScoobyDoo {
    
    //Atributos
    private int idScooby;
    private String nombre;
    private String raza;
    private String comidaPreferida;
    
    //Constructor
    public ScoobyDoo(){
        idScooby=1;
        nombre="Scooby";
        raza="Gran Danes";
        comidaPreferida="Scooby Galletas";
    }

   
    public ScoobyDoo(int idScooby, String nombre, String raza, String comidaPreferida) {
        this.idScooby = idScooby;
        this.nombre = nombre;
        this.raza = raza;
        this.comidaPreferida = comidaPreferida;
    }
    
    public String hablar(int n){
        int i=0;
        String s="";
        while(i<n){
            if(i%2==0){
                s+="dooby";
            }else{
                s+="dooby scooby dooby";
            }
            i++;
        }
        return s;
    }
    
    
    public static void main(String[] args) {
        ScoobyDoo sd = new ScoobyDoo();
        ScoobyDoo sd2 = new ScoobyDoo(1,"Scooby Doo","great dane","Scooby Cookies");
        Scanner sc = new Scanner(System.in);
        int v=Integer.parseInt(sc.nextLine());
        for (int i = 1; i < v; i++) {
            System.out.println("Scooby " + sd.hablar(i) + " Doo");
        }
        
        
    }
    
}
