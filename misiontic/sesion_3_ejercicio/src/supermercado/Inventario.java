package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList();
    }

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProductos(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        System.out.println("----Inventario-----");
        for (Producto p : productos) {//este es el for de python for element in lista
            System.out.println(p.toString());
            
        }
        
        //Este seria el for normalito si el anterior es muy confuso
//        for (int i = 0; i < productos.size(); i++) {
//            productos.get(i).toString();
//        }
        
    }
    
    public void procesarComandos(){
        Scanner s= new Scanner(System.in);
        
        String comando[]=new String[6];
        String bandera="activo";
        while(bandera!="terminar"){
            comando=s.nextLine().split("&");
            if(comando[0].equals("1")){
                Producto p= new Producto();
                p.setIdProducto(Integer.parseInt(comando[1]));
                p.setNombreProducto(comando[2]);
                p.setCantidad(Integer.parseInt(comando[3]));
                p.setPrecio(Integer.parseInt(comando[4]));
                p.setTipo(comando[5]);
                agregarProductos(p);
            }
            if(comando[0].equals("2")){
                listarProductos();
            }
            if(comando[0].equals("3")){
                bandera="terminar";
            }
       }
        
    }
    
    
    public static void main(String[] args) {
        new Inventario().procesarComandos();
    }
    
}