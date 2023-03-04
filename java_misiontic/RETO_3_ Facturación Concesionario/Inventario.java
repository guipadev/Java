import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    
    public static void main(String[] args) {
        new Inventario().procesarComandos();
    }
    
    private ArrayList<Vehiculo> vehiculos;
    private int cantidadParticulares;
    private int cantidadComerciales;

    public Inventario() {
        vehiculos = new ArrayList();
        cantidadParticulares = 100;
        cantidadComerciales = 100;
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
    
    public void imprimirInventario(){
        System.out.println("Particular: " + cantidadParticulares);
        System.out.println("Comercial: " + cantidadComerciales);
    }
    
    public void facturar(int particular, int comercial, int cliente){
        if(particular <= cantidadParticulares && comercial <= cantidadComerciales){
            long total = 0;
            long totalNeto = 0;
            System.out.println("CONCESIONARIO UNCAR\nUNCAR - UNIVA\nNIT: 899.999.063");
            System.out.println("Cliente: "+ cliente);
            System.out.println("Vehículo Cant Precio");
            System.out.println("Particular x" + particular +" $" + 30000000);
            System.out.println("Comercial x" + comercial +" $" + 40000000);        
            total = particular*30000000 + comercial*40000000;
            System.out.println("Iva: $" + calcularIVA(particular + comercial, total));
            totalNeto = total + calcularIVA(particular + comercial, total);
            System.out.println("Total: $" + totalNeto +"\n---");
            cantidadParticulares -= particular;
            cantidadComerciales -= comercial;
        }
        else{
            System.out.println("Lo sentimos no tenemos stock suficiente\n---");
            }
    }
    
    public long calcularIVA(int cantidad, long valorTotal){
        int c;
        if(cantidad <= 20){
            c = Math.abs(cantidad);     
            return (long)(Math.ceil((21-c)/100.0*valorTotal));
        }
        else{
            return 0;
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
                facturar(Integer.parseInt(comando[2]), Integer.parseInt(comando[4]), Integer.parseInt(comando[5]));
            }
            if(comando[0].equals("4")) {
                imprimirInventario();
            }
            if(comando[0].equals("5")) {
                bandera="terminar";
            }
        }
    }
}