package com.dev._06_lavaAutos;

import javax.swing.*;

/*
En un lava autos se cobra el servicio de lavanda de acuerdo al tipo de vehículo.
En caso de que el carro tenga 8 años o más de antiguedad, el costo se incrementa un 20%
Solicitar el año actual, el modelo y el tipo de vehículo
Tenga en cuenta la tabla
Halle el valor a pagar por concepto de la lavada del vehículo
_________________________________________
| TIPO DE VEHIULO           VALOR LAVADA |
| Automovil     Pequeño     4.000        |
|               Mediano     5.000        |
|               De Lujo     6.000        |
|----------------------------------------|
| Campero       Sencillo    5.000        |
|               De lujo     8.000        |
|----------------------------------------|
| Camioneta Cabina sencilla   6.000      |
|           doble cabina      8.000      |
|----------------------------------------|

 */
public class App {

    public static void main(String[] args) {
        final int ANIO = 2023;

        int modelo = 0;

        int tipo = 0;

        int valorLavada = 0;

        int valorTotal = 0;

        int caracteristica = 0;

        int cantAutomovil = 0, cantCampero = 0, cantCamioneta = 0;

        int cantidadIncremento = 0;

        String resultado = "";

        int cantVehiculos = 0; //Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculo a lavar"));

        String menu = " MENU AUTOLAVADO\n 1. Automovil\n 2. Campero\n 3. Camioneta\n Ingrese el Tipo\n";
        String menuAutomovil = " MENU AUTOMOVIL\n 1. Mediano\n 2. De Lujo\n Ingrese las caracteristicas\n";
        String menuCampero = " MENU CAMPERO\n 1. Sencillo\n 2. De Lujo\n Ingrese las caracteristicas\n";
        String menuCamioneta = " MENU CAMIONETA\n 1. Cabina Sencilla\n 2. Doble Cabina\n Ingrese las caracteristicas\n";

        String pregunta = "";

        do {

            modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo"));

            if (modelo > ANIO) {
                System.out.println("Continua");
                continue;
            }


            do {
                tipo = Integer.parseInt(JOptionPane.showInputDialog(menu));

            } while (tipo < 1 || tipo > 3);

            switch (tipo) {
                case 1:
                    caracteristica = Integer.parseInt(JOptionPane.showInputDialog(menuAutomovil));

                    cantAutomovil++;

                    switch (caracteristica) {
                        case 1:
                            System.out.println("Lavada cuesta $4000");
                            valorLavada = 4000;
                            break;
                        case 2:
                            System.out.println("Lavada cuesta $5000");
                            valorLavada = 5000;
                            break;
                        case 3:
                            System.out.println("Lavada cuesta $6000");
                            valorLavada = 6000;
                            break;
                        default:
                            System.out.println("No existe esa caracteristica");
                            break;
                    }

                    break;
                case 2:
                    caracteristica = Integer.parseInt(JOptionPane.showInputDialog(menuCampero));

                    cantCampero++;

                    switch (caracteristica) {
                        case 1:
                            System.out.println("Lavada cuesta $5000");
                            valorLavada = 5000;
                            break;
                        case 2:
                            System.out.println("Lavada cuesta $8000");
                            valorLavada = 8000;
                            break;
                        default:
                            System.out.println("No existe esa caracteristica");
                            break;
                    }
                    break;
                case 3:
                    caracteristica = Integer.parseInt(JOptionPane.showInputDialog(menuCamioneta));

                    cantCamioneta++;

                    switch (caracteristica) {
                        case 1:
                            System.out.println("Lavada cuesta $6000");
                            valorLavada = 6000;
                            break;
                        case 2:
                            System.out.println("Lavada cuesta $8000");
                            valorLavada = 8000;
                            break;
                        default:
                            System.out.println("No existe esa caracteristica");
                            break;
                    }

                    break;
                default:
                    System.out.println("No existe el tipo");
                    break;
            }

            int antiguedad = ANIO - modelo;

            if (antiguedad >= 8) {
                cantidadIncremento++;

                System.out.println("La antigueedad del vehiculo es: " + antiguedad + " años");

                valorTotal = (int) (valorLavada + (valorLavada * 0.2));

                System.out.println("Tiene un incremeneto del 20% equivalente a: " + (valorLavada*0.2) + " pagaria un total de: $" + valorTotal);

            } else {
                System.out.println("No tiene incrementos, regres pronto!");
            }

            cantVehiculos++;

            pregunta = JOptionPane.showInputDialog("Desea ingresar más vehiculos, ingrese 'si' para continuar");

        } while (pregunta.equalsIgnoreCase("si"));

        resultado = "RESULTADO GENERALES\n" +
                "Cantidad de vehiculos: " + cantVehiculos + "\n" +
                "Cantidad de Automoviles: " + cantAutomovil + "\n" +
                "Cantidad de Camperos: " + cantCampero + "\n" +
                "Cantidad de Camionetas: " + cantCamioneta + "\n" +
                "Cantidad de Incrementos: " + cantidadIncremento
        ;

        System.out.println(resultado);

        JOptionPane.showMessageDialog(null, resultado);

    }
}
