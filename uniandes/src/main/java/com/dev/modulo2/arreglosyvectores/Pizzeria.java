package com.dev.modulo2.arreglosyvectores;

public class Pizzeria {

    private int cantidadProducida;
    private double precioDeVenta;

    /**
     * UNA PEQUEÑA MEJORA - CONSTANTES
     * Valores que nunca cambian o que cambian muy rara vez
     * - Número de países en el mundo
     *
     * Dominios de datos por extensión
     * - Estados civiles de una persona
     */
    public final static int CANTIDAD_COCINEROS = 4;
    public final static int FILAS = 3;
    public final static int COLUMNAS = 4;

    /**
     * ARREGLO 2D
     * Almacenar colecciones de elementos en 2 dimensiones
     * - Matrices
     * - Se comportan igual que los arreglos en 1D pero se especiican 2 "coordenadas"
     */
    private Mesa[][] mesas;

    /*
    private Cocinero cocinero1;
    private Cocinero cocinero2;
    private Cocinero cocinero3;
    private Cocinero cocinero4;
    */
    private Cocinero[] cocineros;

    /**
     * 4) ARREGLOS ID (TAMAÑO FIJO)
     * Colección de Objetos que se almacenan de forma lineal (Una Dimensión)
     */
    public Pizzeria() {
        cocineros = new Cocinero[CANTIDAD_COCINEROS];
        // Agregar elementos a un arreglo
        cocineros[0] = new Cocinero();

        mesas = new Mesa[FILAS][COLUMNAS];
        // Agregar elementos arreglo 2D
        mesas[0][0] = new Mesa();

    }


    /**
     * 2) INSTRUCCIONES CONDICIONALES SIMPLES
     * Realizar una acción dependiendo de si se cumple o no una o más condiciones
     */
    public void cambiarPrecio() {
        if (cantidadProducida < 15)
            precioDeVenta *= 0.8;
        /**
         * 3) INSTRUCCIONES CONDICIONALES EN CASCADA
         * No existe una sola condición si no varias de ellas que son excluyentes entre sí
         */
        else if (cantidadProducida >= 15 && cantidadProducida <= 25)
            precioDeVenta = 0.85;
        else
            precioDeVenta *= 1.05;
    }

    // Agregar elementos a un arreglo
    public int darTotalUnidadesProducidas() {
        int suma = 0;

        if (cocineros[0] != null)
            suma += cocineros[0].darCantidadProducida();

        if (cocineros[1] != null)
            suma += cocineros[1].darCantidadProducida();

        if (cocineros[2] != null)
            suma += cocineros[2].darCantidadProducida();

        if (cocineros[3] != null)
            suma += cocineros[3].darCantidadProducida();

        return suma;
    }

    //5) INSTRUCCIONES REPETITIVAS FOR
    //6) Patron de recorrido total -> Revisar todos los elementos
    public int darTotalUnidadesProducidasFor() {
        int suma = 0;

        for (int i = 0; i < CANTIDAD_COCINEROS; i++) {
            if (cocineros[i] != null)
                suma += cocineros[i].darCantidadProducida();
        }

        return suma;
    }

    // 5) INSTRUCCIONES REPETITIVAS WHILE
    public int darTotalUnidadesProducidasWhile() {
        int suma = 0;
        int i = 0;

        while ( i < CANTIDAD_COCINEROS) {
            if (cocineros[i] != null)
                suma += cocineros[i].darCantidadProducida();
            i++;
        }

        return suma;
    }

    //6) Patron de recorrido parcial -> Revisar los elementos hasta cumplir una condición
    public boolean existerSuperCocinero() {
        boolean existe = false;

        for (int i = 0; i < CANTIDAD_COCINEROS; i++) {
            if (cocineros[i] != null && cocineros[i].darCantidadProducida() > 1000)
                existe = true;
        }
        return existe;
    }

    // Recorrido Array 2D
    //¿Cuántos clientes hay en la pizzería?
    public int contarClientes() {

        int clientes = 0;

        for (int i = 0; i < FILAS; i++)
            for (int j = 0; j < COLUMNAS; j++) {
                Mesa actual = mesas[i][j];
                clientes += actual.darClientesSentados();
            }

        return clientes;
    }

    /**
     * OTROS RECORRIDOS EN ARREGLOS 2D
     * - Diagonal
     * - 2 Diagonales
     * - Escalera
     * - Vecinos de un elemento
     * - Vecinos en cruz de un elemento
     */
    //¿Existe una mesa vacía?
    public boolean hayVacia() {

        boolean vacia = false;

        for (int i = 0; i < FILAS && !vacia; i++)
            for (int j = 0; j < COLUMNAS && !vacia; j++) {
                Mesa actual = mesas[i][j];

                if(actual.darClientesSentados() == 0)
                    vacia = true;
            }

        return vacia;
    }
}