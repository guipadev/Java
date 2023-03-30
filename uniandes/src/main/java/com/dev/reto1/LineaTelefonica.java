package com.dev.reto1;

/**
 * Agregue a la clase LineaTelefonica un nuevo atributo llamado numeroMinutosCelular para guardar la cantidad
 * de minutos consumidos en llamadas a celular.
 */
public class LineaTelefonica {

    /**
     * Número de minutos consumidos en llamadas a celular
     */

    // Atributos

    private int numeroMinutosCelular;
    private int numeroLlamadas;
    private int numeroMinutos;
    private int costoLlamadas;

    /**
     * Inicializa la línea telefónica post: La línea se inicializó con valores en cero.
     * Haga los ajustes necesarios en el método inicializar para que ahora se contemple el nuevo atributo.
     */
    public void inicializar() {
        numeroLlamadas = 0;
        numeroMinutos = 0;
        costoLlamadas = 0;
        numeroMinutosCelular = 0;
    }


    public int dartotalMinutosCelular() {
        return numeroMinutosCelular;
    }

    /**
     * Devuelve el número de minutos consumidos en llamadas a celular
     *
     * Complete el método darNumeroMinutosCelular de la clase LineaTelefonica para que devuelva (retorne)
     * el número de minutos consumidos en llamadas a celular sobre la línea
     */
    public int darNumeroMinutosCelular() {

        return numeroMinutosCelular;
    }


    /**
     * Agrega una llamada a celular a la línea telefónica
     * post: Se incremento en 1 numeroDeLlamadas, se incremento
     * numeroDeMinutos en minutos, costoLlamadas aumento en ( minutos * 999 )
     * @param minutos Número de minutos de la llamada. minutos >0.
     *
     * Modifique el método agregarLlamadaCelular de la clase LineaTelefonica para que ahora,
     * adicionalmente, registre el número de minutos consumidos
     * (el cual entra como parámetro) en llamadas a celular sobre la línea.
     */
    public void agregarLlamadaCelular( int minutos)
    {
        //Una llamada más
        numeroLlamadas = numeroLlamadas + 1;

        //Suma los minutos consumidos
        numeroMinutos = numeroMinutos + minutos;

        //Suma el costo (costo por minuto: 999 pesos)
        costoLlamadas = costoLlamadas + ( minutos * 999 );

        // Registro numero de minutos consumidos
        numeroMinutosCelular = numeroMinutosCelular + minutos;
    }

}
