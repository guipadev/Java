import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    
    public static void main(String[] args) {
        new Inventario().procesarComandos();
    }
    
    private ArrayList<Vehiculo> vehiculos;

    public Inventario() {
        vehiculos = new ArrayList();
    }

    public Inventario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    
    public void listarVehiculos(){
        System.out.println("***Inventario de vehículos***");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
    }
    
    public void procesarComandos(){
        Scanner s = new Scanner(System.in);
        
        String comando[] = new String[6];
        String bandera = "activo";
        while (bandera!="terminar"){
            comando = s.nextLine().split("&");
            if(comando[0].equals("1")) {
                if(comando[1].equals("Particular")){
                    Particular v = new Particular();
                    v.setPasajeros(Integer.parseInt(comando[2]));
                    v.setVelocidad(Integer.parseInt(comando[3]));
                    v.setPlaca(comando[4]);
                    v.setColor(comando[5]);
                    agregarVehiculo(v);
                }else {
                    Comercial v = new Comercial();
                    v.setPasajeros(Integer.parseInt(comando[2]));
                    v.setVelocidad(Integer.parseInt(comando[3]));
                    v.setPlaca(comando[4]);
                    v.setCargaMax(Integer.parseInt(comando[5]));
                    agregarVehiculo(v);
                }
            }               
            if(comando[0].equals("2")) {
                listarVehiculos();
            }
            if(comando[0].equals("3")) {
                bandera="terminar";
            }
        }
    }
}