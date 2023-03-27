package com.curso.estructuradeunaclasecamposymetodos;

/**
 *
 * @author yamid
 */
public class Principal {
    
    public static void main(String[] args) {
        Vehiculo carro1 = new Vehiculo();
        carro1.marca = "Renault";
        carro1.paisOrigen = "Francia";
        carro1.prender();
        
        Vehiculo carro2 = new Vehiculo();
        carro2.marca = "Toyota";
        carro2.paisOrigen = "Japon";
        carro2.prender();
    }
}
