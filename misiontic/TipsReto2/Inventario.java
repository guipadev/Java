
import java.util.LinkedList;
import java.util.List;


public class Inventario {

    public static void main(String[] args) {
        
        Vehiculo spark = new Vehiculo("RZL455", 200);
        Vehiculo spark2 = new Vehiculo("ZQR421", 300);        
        
        System.out.println(spark);
        System.out.println(spark2);
        
        Vehiculo BMW = new Comercial ("TKP178", 352, 2000);
        
        //List<Vehiculo> vehiculos = new LinkedList<>();
        //vehiculos.add(BMW);
        
        System.out.println(BMW);
        
        
    }
}
