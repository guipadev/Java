package com.dev.modulo1.reto1;

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
    /**
     * Número de llamadas realizadas
     */
    private int numeroLlamadas;
    /**
     * Número de minutos consumidos
     */
    private int numeroMinutos;
    /**
     * Costo total de las llamadas
     */
    private double costoLlamadas;

    /**
     * Inicializa la línea telefónica post: La línea se inicializó con valores en cero.
     * Haga los ajustes necesarios en el método inicializar para que ahora se contemple el nuevo atributo.
     */
    public void inicializar() {
        numeroLlamadas = 0;
        numeroMinutos = 0;
        costoLlamadas = 0.0;
        numeroMinutosCelular = 0;
    }

    /**
     * Reinicia la linea telefónica, dejando todos us valores en cero
     */
    public void reiniciar() {
        inicializar();

    }

    /**
     * Devuelve el costo total de las llamadas realizadas
     * @return Costo total de las llamadas realizadas
     */
    public double darCostoLlamadas() {
        return costoLlamadas;
    }

    /**
     * Devuelve el número de llamadas realizadas por est línea
     * @return Número de llamadas realizadas por esta linea
     */
    public int darNumeroLlamadas() {
        return numeroLlamadas;
    }

    /**
     * Devuelve el número de minutos consumidos
     * @return Número de minutos consumidos
     */
    public int darNumeroMinutos() {
        return numeroMinutos;
    }

    /**
     * Agregar una llamada local a la linea telefonica <br>
     * <b>post: </b> Se incrementa en 1 numeroDeLlamadas, se incremento numeroDeMinutos en minutos,
     * dostLlamadas aumento en (minutos * 35)
     * @param minutos Número de miutos de la llamda minutos > 0
     */
    public void agregarLlamadaLocal(int minutos) {
        numeroLlamadas += 1;

        numeroMinutos += minutos;

        costoLlamadas += (minutos * 35);
    }

    /**
     * Agrega una llamada de larga distancia a la línea telefónica <br>
     * <b>post: </b> Se incrementó en 1 numeroDeLlamadas, se incrementó
     * numeroDeMinutos en minutos, costoLlamadas aumentó en ( minutos * 380)
     * @param minutos Número de minutos de la llamada. minutos > 0
     */
    public void agregarLlamadaLargaDistancia(int minutos) {
        numeroLlamadas += 1;

        numeroMinutos += minutos;

        costoLlamadas += (minutos * 380);
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
        numeroLlamadas += 1;

        //Suma los minutos consumidos
        numeroMinutos += minutos;

        //Suma el costo (costo por minuto: 999 pesos)
        costoLlamadas += (minutos * 999);
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






    protected double costoLlamadas() {
        return 0;
    }
}
