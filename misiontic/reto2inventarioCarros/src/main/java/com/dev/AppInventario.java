package com.dev;

import java.util.ArrayList;
import java.util.Scanner;

public class AppInventario {
    public static void main(String[] args) {
        new AppInventario().procesarComandos();
    }

    private ArrayList<Vehiculo> vehiculos;

    public AppInventario() {
        vehiculos = new ArrayList();
    }

    public AppInventario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo(Vehiculo carro){
        vehiculos.add(carro);
    }

    public void listarVehiculos(){
        System.out.println("************** Inventario de vehículos **************");

        for (Vehiculo carro : vehiculos) {
            System.out.println(carro.toString());
        }
    }

    public void procesarComandos(){

        System.out.println(
                    "Opción 1:\n Agregar vehículo de la siguiente forma para particular o comercial\n" +
                            "1&Comercial&2&150&FFF 222&250 EQUIVALE => 1&Comercial&numeroPasajeros&velocidadMaxima&placa&peso_maximo\n" +
                            "1&Particular&8&160&EEE 111&Verde EUIVALE => 1&Particular&numeroPasajeros&velocidadMaxima&placa&color\n" +
                            "Opción 2:\n Listar inventario, digitar el ńumero 2\n" +
                            "Opción 3:\n Salir, digitar el ńumero 3"
        );

        Scanner teclado = new Scanner(System.in);

        String comando[] = new String[6];

        String bandera = "activo";

        while (bandera != "terminar"){
            comando = teclado.nextLine().split("&");

            if (comando[0].equals("1")) {

                if(comando[1].equals("Particular")){
                    VehiculoParticular carro = new VehiculoParticular();

                    carro.setPasajeros(Integer.parseInt(comando[2]));
                    carro.setVelocidad(Integer.parseInt(comando[3]));
                    carro.setPlaca(comando[4]);
                    carro.setColor(comando[5]);

                    agregarVehiculo(carro);
                }else {
                    VehiculoComercial carroCom = new VehiculoComercial();

                    carroCom.setPasajeros(Integer.parseInt(comando[2]));
                    carroCom.setVelocidad(Integer.parseInt(comando[3]));
                    carroCom.setPlaca(comando[4]);
                    carroCom.setCargaMax(Integer.parseInt(comando[5]));

                    agregarVehiculo(carroCom);
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