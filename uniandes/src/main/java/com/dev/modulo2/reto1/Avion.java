package com.dev.modulo2.reto1;

/**
 * Se quiere extender el ejercicio del avión para que dé más información sobre el estado de ocupación del mismo.
 * Se desea:
 * - Contar el número de sillas económicas desocupadas, ubicadas en la ventana
 * - Contar el número de sillas económicas desocupadas, ubicadas en el pasillo
 * - Determinar si hay un cierto número de sillas libres, ubicadas en el pasillo o en la ventana
 * - Buscar una silla económica libre, desde la parte de atrás del avión
 */


public class Avion {

    /**
     * Numero de sillas ejecutivas
     */
    public final static int SILLAS_EJECUTIVAS = 8;
    /**
     * Numero de sillas econ�micas
     */
    public final static int SILLAS_ECONOMICAS = 42;

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
    /**
     * Sillas de la clase ejecutiva del avi�n
     */
    private Silla[] sillasEjecutivas;
    /**
     * Sillas de la clase econ�mica del avi�n
     */
    private Silla[] sillasEconomicas;

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Construye al avi�n
     */
    public Avion( )
    {
        int ubicacion;

        // Crea las sillas ejecutivas
        sillasEjecutivas = new Silla[SILLAS_EJECUTIVAS];

        // crea las sillas econ�micas
        sillasEconomicas = new Silla[SILLAS_ECONOMICAS];

        sillasEjecutivas[ 0 ] = new Silla( 1, Silla.CLASE_EJECUTIVA, Silla.VENTANA );
        sillasEjecutivas[ 1 ] = new Silla( 2, Silla.CLASE_EJECUTIVA, Silla.PASILLO );
        sillasEjecutivas[ 2 ] = new Silla( 3, Silla.CLASE_EJECUTIVA, Silla.PASILLO );
        sillasEjecutivas[ 3 ] = new Silla( 4, Silla.CLASE_EJECUTIVA, Silla.VENTANA );
        sillasEjecutivas[ 4 ] = new Silla( 5, Silla.CLASE_EJECUTIVA, Silla.VENTANA );
        sillasEjecutivas[ 5 ] = new Silla( 6, Silla.CLASE_EJECUTIVA, Silla.PASILLO );
        sillasEjecutivas[ 6 ] = new Silla( 7, Silla.CLASE_EJECUTIVA, Silla.PASILLO );
        sillasEjecutivas[ 7 ] = new Silla( 8, Silla.CLASE_EJECUTIVA, Silla.VENTANA );

        for( int numSilla = 1 + SILLAS_EJECUTIVAS, j = 1; j <= SILLAS_ECONOMICAS; numSilla++, j++ )
        {
            //Sillas ventana
            if( j % 6 == 1 || j % 6 == 0 )
                ubicacion = Silla.VENTANA;
                //Sillas centrales
            else if( j % 6 == 2 || j % 6 == 5 )
                ubicacion = Silla.CENTRAL;
                //Sillas pasillo
            else
                ubicacion = Silla.PASILLO;

            sillasEconomicas[ j - 1 ] = new Silla( numSilla, Silla.CLASE_ECONOMICA, ubicacion );
        }
    }

    /**
     * Asigna la silla a un pasajero, seg�n sus preferencias de clase y ubicaci�n <br>
     * <b>post: </b> Si existe una silla con la clase y la ubicaci�n dada, el pasajero queda asignado en la primera de ellas seg�n el orden num�rico.
     * @param clase - clase elegida por el pasajero - clase pertenece {CLASE_EJECUTIVA,CLASE_ECONOMICA}
     * @param ubicacion - ubicaci�n elegida por el pasajero - si clase = CLASE_ECONOMICA entonces ubicaci�n pertenece {VENTANA, CENTRAL, PASILLO}, o si clase = CLASE_EJECUTIVA
     *        entonces ubicaci�n pertenece {VENTANA, PASILLO}
     * @param pasajero - pasajero a asignar - pasajero != null y no tiene silla en el avi�n
     * @return silla asignada - Si no se asigna una silla retorna null
     */
    public Silla asignarSilla( int clase, int ubicacion, Pasajero pasajero )
    {
        //busca una silla libre
        Silla silla = null;
        if( clase == Silla.CLASE_EJECUTIVA )
        {
            silla = buscarSillaEjecutivaLibre( ubicacion );
        }
        else if( clase == Silla.CLASE_ECONOMICA )
        {
            silla = buscarSillaEconomicaLibre( ubicacion );
        }
        if( silla != null )
        {
            silla.asignarAPasajero( pasajero );
        }
        return silla;
    }

    /**
     * Busca la siguiente silla ejecutiva que este libre y tenga la ubicaci�n indicada.
     * @param ubicacion - ubicaci�n en donde buscar la silla - ubicaci�n pertenece {VENTANA, PASILLO}
     * @return La silla libre encontrada. Si no encuentra retorna null.
     */
    public Silla buscarSillaEjecutivaLibre( int ubicacion )
    {
        boolean encontrado = false;
        Silla silla = null;
        for( int i = 0; i < SILLAS_EJECUTIVAS && !encontrado; i++ )
        {
            silla = sillasEjecutivas[ i ];
            if( ! ( silla.sillaAsignada( ) ) && silla.darUbicacion( ) == ubicacion )
            {
                encontrado = true;
            }
        }
        if( encontrado )
            return silla;
        else
            return null;
    }

    /**
     * Busca la siguiente silla econ�mica que este libre y tenga la ubicaci�n indicada.
     * @param ubicacion - ubicaci�n en donde buscar la silla - ubicaci�n pertenece {VENTANA, CENTRAL, PASILLO}
     * @return la silla encontrada libre. Si no encuentra retorna null
     */
    public Silla buscarSillaEconomicaLibre( int ubicacion )
    {
        boolean encontrado = false;
        Silla silla = null;
        for( int i = 0; i < SILLAS_ECONOMICAS && !encontrado; i++ )
        {
            silla = sillasEconomicas[ i ];
            if( ! ( silla.sillaAsignada( ) ) && silla.darUbicacion( ) == ubicacion )
            {
                encontrado = true;
            }
        }
        if( encontrado )
            return silla;
        else
            return null;
    }

    /**
     * Busca un pasajero en el avi�n
     * @param pasajero - pasajero a buscar - pasajero != null
     * @return silla en la que se encontr� el pasajero. Si no lo encuentra retorna null
     */
    public Silla buscarPasajero( Pasajero pasajero )
    {
        //Busca el pasajero en ejecutiva
        Silla silla = buscarPasajeroEjecutivo( pasajero );
        //Si no estaba en ejecutiva
        if( null == silla )
            //Busca en econ�mica
            silla = buscarPasajeroEconomico( pasajero );
        return silla;

    }

    /**
     * Busca un pasajero en las sillas ejecutivas
     * @param pasajero - pasajero a buscar - pasajero != null
     * @return silla en la que se encontr� el pasajero. Si no lo encuentra retorna null
     */
    public Silla buscarPasajeroEjecutivo( Pasajero pasajero )
    {
        boolean encontrado = false;
        Silla silla = null;
        for( int i = 0; i < SILLAS_EJECUTIVAS && !encontrado; i++ )
        {
            silla = sillasEjecutivas[ i ];
            if( silla.sillaAsignada( ) && silla.darPasajero( ).igualA( pasajero ) )
            {
                encontrado = true;
            }
        }
        if( encontrado )
            return silla;
        else
            return null;
    }

    /**
     * Busca un pasajero en las sillas econ�micas
     * @param pasajero - pasajero a buscar - pasajero != null
     * @return silla en la que se encontr� el pasajero. Si no lo encuentra retorna null
     */
    public Silla buscarPasajeroEconomico( Pasajero pasajero )
    {
        boolean encontrado = false;
        Silla silla = null;
        for( int i = 0; i < SILLAS_ECONOMICAS && !encontrado; i++ )
        {
            silla = sillasEconomicas[ i ];
            if( silla.sillaAsignada( ) && silla.darPasajero( ).igualA( pasajero ) )
            {
                encontrado = true;
            }
        }
        if( encontrado )
            return silla;
        else
            return null;
    }

    /**
     * Desasigna la silla de un pasajero <br>
     * <b>post: </b> Si se encuentra una silla con el pasajero, la silla quedara con su pasajero == null
     * @param pasajero - pasajero a retirar - pasajero != null
     * @return true si encontr� el pasajero y desasign� la silla, false en caso contrario
     */
    public boolean desasignarSilla( Pasajero pasajero )
    {
        //Busca el pasajero en el avi�n
        Silla silla = buscarPasajero( pasajero );
        //Si lo encuentra desasigna
        if( silla != null )
        {
            silla.desasignarSilla( );
            return true;
        }
        else
            return false;
    }

    /**
     * Retorna el n�mero de sillas ejecutivas ocupadas
     * @return numero de ejecutivas sillas ocupadas
     */
    public int contarSillasEjecutivasOcupadas( )
    {
        int contador = 0;
        for( int i = 0; i < SILLAS_EJECUTIVAS; i++ )
        {
            if( sillasEjecutivas[ i ].sillaAsignada( ) )
            {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Retorna el n�mero de sillas econ�micas ocupadas
     * @return numero de sillas econ�micas ocupadas
     */
    public int contarSillasEconomicasOcupadas( )
    {
        int contador = 0;
        for( int i = 0; i < SILLAS_ECONOMICAS; i++ )
        {
            if( sillasEconomicas[ i ].sillaAsignada( ) )
            {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Calcula el porcentaje de ocupaci�n del avi�n
     * @return porcentaje total de ocupaci�n
     */
    public double calcularPorcentajeOcupacion( )
    {
        double porcentaje;
        int totalSillas = SILLAS_ECONOMICAS + SILLAS_EJECUTIVAS;
        int sillasOcupadas = contarSillasEconomicasOcupadas( ) + contarSillasEjecutivasOcupadas( );
        porcentaje = ( double )sillasOcupadas / totalSillas * 100;
        return porcentaje;
    }

    /**
     * Retorna las sillas ejecutivas del avi�n
     * @return sillas ejecutivas
     */
    public Silla[] obtenerSillasEjecutivas( )
    {
        return sillasEjecutivas;
    }

    /**
     * Retorna las sillas econ�micas del avi�n
     * @return sillas econ�micas
     */
    public Silla[] obtenerSillasEconomicas( )
    {
        return sillasEconomicas;
    }

    /**
     * M�todo 1 de extensi�n al ejemplo
     * @return respuesta
     */
    public String metodo1( )
    {
        return "respuesta 1";
    }

    /**
     * M�todo 2 de extensi�n al ejemplo
     * @return respuesta
     */
    public String metodo2( )
    {
        return "respuesta 2";
    }

    /**
     * 1) Implemente el método contarSillasEconomicasDesocupadasVentana de la clase Avion para que retorne
     * el número de sillas económicas libres que están ubicadas en la ventana.
     */

    /**
     * Cuenta el número de sillas económicas, que están ubicadas en la
     * ventana y que se encuentran libres
     * @return - Número de sillas económicas libres y que están en la ventana
     */
    public int contarSillasEconomicasDesocupadasVentana()
    {
        boolean encontrado = false;



        return 0;
    }

    /**
     * 2) Implemente el método contarSillasEconomicasDesocupadasPasillo de la clase Avion
     * para que retorne el número de sillas económicas libres que están ubicadas en el pasillo
     *
     * Cuenta el número de sillas económicas, que están ubicadas en el
     * pasillo y que se encuentran libres
     * @return - Número de sillas económicas libres y que están en el pasillo
     */
    public int contarSillasEconomicasDesocupadasPasillo()
    {

        return 0;
    }

    /**
     * 3) Implemente el método hayNumSillasEconomicasLibresPasilloVentana de la clase Avion
     * que indica si hay por lo menos un cierto número de sillas económicas (dado como parámetro) libres
     * y ubicadas en el pasillo o en la ventana. Los métodos realizados anteriormente pueden ser de ayuda.
     *
     * Indica si hay por lo menos un cierto numero de sillas económicas *disponibles en el pasillo o en la ventana.
     * @param - nSillas - Minimo numero de sillas libres que se busca, ubicadas *en pasillo o ventana
     * @return - True si hay por lo menos nSillas libres en pasillo o ventana, *false en caso contrario
     */
    public boolean hayNumSillasEconomicasLibresPasilloVentana(int nSillas) {

        return false;
    }

    /**
     * 4) Implemente el método buscarSillaEconomicaLibreReves de la clase Avion que busca
     * la primera silla económica que esté libre y en la ubicación dada como parámetro,
     * pero buscando desde la parte de atrás del avión
     *
     * Busca la primera silla económica que este libre y tenga la ubicación *indicada, revisando desde la parte de atrás del avión
     * @param ubicacion - ubicación en donde buscar la silla - ubicacion *pertenece {VENTANA, CENTRAL, PASILLO}
     * @return La silla encontrada libre. Si no encuentra retorna null
     */
    public Silla buscarSillaEconomicaLibreReves(int ubicacion) {

        return null;
    }
}
