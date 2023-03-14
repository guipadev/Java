package com.dev.ciudad;

import java.util.List;
import com.dev.vehiculo.Vehiculo;

public class Ciudad {

    /**
     * Set of vehicles in the city
     */
    protected List<Vehiculo> listaVehiculos;
    /**
     * Set of places in the city
     */
    protected List<Sitio> listaSitios;
    /**
     * Map of the city. Used for painting the city
     */
    protected char[][] mapa;

    /**
     * Creates a city with the given vehicles and places
     *
     * @param listaVehiculos
     * @param sitio Set of places in the city
     */
    public Ciudad(List<Vehiculo> listaVehiculos, List<Sitio> listaSitios) {
        this.listaVehiculos = listaVehiculos;
        this.listaSitios = listaSitios;
        mapa = new char[ParametrosDibujo.ALTO][ParametrosDibujo.ANCHO];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = ' ';
            }
        }
    }

    /**
     * Moves the vehicles in the city. Vehicles moves one square from left to
     * right but can move up or down in a random fashion
     */
    public void mover() {
        if (listaVehiculos != null) {
            for(Vehiculo vehiculo: listaVehiculos){
                int f = Math.random() > 0.5 ? 1 : -1;
                int c = 1;
                vehiculo.mover(f, c);
            }
        }
    }

    public void moverReversa() {
        if (listaVehiculos != null) {
            for(Vehiculo vehiculo: listaVehiculos){
                int f = Math.random() > 0.5 ? 1 : -1;
                int c = -1;
                vehiculo.mover(f, c);
            }
        }
    }

    /**
     * Paints the set of vehicles and places in the map
     */
    public String pintar() {
        String lienzoMapa = "";
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = ' ';
            }
        }

        if (listaSitios != null) {
            for(Sitio sitio: listaSitios){
                sitio.pintar(mapa);
            }
        }
        
        if (listaVehiculos != null) {
            for(Vehiculo vehiculo: listaVehiculos){
                vehiculo.pintar(mapa);  
            }
        }

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                lienzoMapa += mapa[i][j];
            }
            lienzoMapa += "\n";
        }

        return lienzoMapa;
    }
}
