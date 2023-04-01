package com.dev.modulo1.reto1;

/*
* Construya el método darTotalMinutosCelular de la clase Empresa que retorne el número total de minutos consumidos
* en llamadas a celular realizadas en las 3 líneas telefónicas.
* Es decir, la suma de los minutos de llamadas a celular realizadas en cada línea telefónica.
* El nuevo método darTotalMinutosCelular debe utilizar (llamar) obligatoriamente
* el método darNumeroMinutosCelular ( ) sobre linea1, linea2 y linea3,
* para obtener de cada una de ellas, el número de minutos consumidos en llamadas a celular.
* */

/**
 * La empresa necesita conocer qué porcentaje representa la cantidad total de minutos de llamadas a celular con respecto
 * al total de minutos consumidos en todos los tipos de llamadas en todas las líneas.
 * Construya el método darPorcentajeCelular de la clase Empresa que calcule y retorne este valor.
 */

public class Empresa {
    private LineaTelefonica linea1;
    private LineaTelefonica linea2;
    private LineaTelefonica linea3;

    public Empresa(LineaTelefonica linea1, LineaTelefonica linea2, LineaTelefonica linea3) {
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.linea3 = linea3;
    }

    /**
     * Inicializa las líneas telefónicas de la empresa <br>
     * <b>post: </b> Se inicializaron las 3 líneas telefónicas
     */
    public void inicializar() {
        //Inicializa la linea 1
        linea1 = new LineaTelefonica();
        linea1.inicializar();

        //Inicializa la linea 2
        linea2 = new LineaTelefonica();
        linea2.inicializar();

        //Inicializa la linea 3
        linea3 = new LineaTelefonica();
        linea3.inicializar();
    }

    /**
     * Devuelve la línea 1
     * @return Línea 1
     */
    public LineaTelefonica darLinea1() {
        return linea1;
    }

    public LineaTelefonica darLinea2() {
        return linea2;
    }

    public LineaTelefonica darLinea3() {
        return linea3;
    }

    /**
     * Agregar una llamada local a la línea telefónica 2 <br>
     * <b>post: </b> Se agrega la llamada a la LÍNEA 2
     * @param minutos Número de minutos de la llamada.minutos > 0
     */
    public void agregarLlamadaLocalLinea1(int minutos) {
        linea1.agregarLlamadaLocal(minutos);
    }

    public void agregarLlamadaLocalLinea2(int minutos) {
        linea2.agregarLlamadaLocal(minutos);
    }

    public void agregarLlamadaLocalLinea3(int minutos) {
        linea3.agregarLlamadaLocal(minutos);
    }

    /**
     * Agregar una llamada de larga distancia a la linea telefonica 1 <br>
     * <b>post: </b> Se agrega la llamada a la linea 1
     * @param minutos Número de minutos de la llamada minutos > 0
     */
    public void agregarLlamadaLargaDistanciaLinea1(int minutos) {
        linea1.agregarLlamadaLargaDistancia(minutos);
    }

    public void agregarLlamadaLargaDistanciaLinea2(int minutos) {
        linea2.agregarLlamadaLargaDistancia(minutos);
    }

    public void agregarLlamadaLargaDistanciaLinea3(int minutos) {
        linea3.agregarLlamadaLargaDistancia(minutos);
    }

    /**
     * Agregar una llamada a celular a la linea telefonica 1 <br>
     * <b>post: </b> Se agrega la llamada a la línea 1
     * @oaram minutos Número de minutos de la llamada minutos > 0
     */
    public void agregarLlamadaCelularLinea1(int minutos) {
        linea1.agregarLlamadaCelular(minutos);
    }

    public void agregarLlamadaCelularLinea2(int minutos) {
        linea2.agregarLlamadaCelular(minutos);
    }

    public void agregarLlamadaCelularLinea3(int minutos) {
        linea3.agregarLlamadaCelular(minutos);
    }

    /**
     * Devuelve el número total de llamadas realizadas
     * @return total de llamadas de las tres lineas
     */
    public double darTotalNumeroLlamadas() {
        return linea1.darNumeroLlamadas() + linea2.darNumeroLlamadas() + linea3.darNumeroLlamadas();
    }

    /**
     * Devuelve el total de minutos consumidos
     * @return total de minutos de las tres lineas
     */
    private double darTotalMinutos() {
        return linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos();
    }

    /**
     * Devuelve el costo total de las llamadas realizadas
     * @return costo total de las tres llamadas
     */
    public double darTotalCostoLlamadas() {
        return linea1.costoLlamadas() + linea2.costoLlamadas() + linea3.costoLlamadas();
    }

    /**
     * Devuelve el costo promedio de un minuto, según los minutos consumidos <br>
     * <b>pre: </b> TotalMinutos > 0
     * @return Costo promedio por minuto
     */
    public double darCostroPromedioMinuto() {
        return darTotalCostoLlamadas() / darTotalMinutos();
    }

    public void reiniciar() {
        linea1.reiniciar();
        linea2.reiniciar();
        linea3.reiniciar();
    }

    /**
     * Devuelve el número total de llamadas realizadas a celular
     */
    public int darTotalMinutosCelular() {
        int totalMinutosCelular = 0;

        totalMinutosCelular += linea1.darNumeroMinutosCelular();
        totalMinutosCelular += linea2.darNumeroMinutosCelular();
        totalMinutosCelular += linea3.darNumeroMinutosCelular();

        return totalMinutosCelular;
    }

    /**
     * Calcula el porcentaje de minutos a celular que ha consumido la empresa
     * respecto al total de minutos consumidos
     * @return el porcentaje de minutos a celular respecto el total de minutos. double entre 0 y 100
     */

    /**
     * El porcentaje de minutos a celular debe ser cero.
     * En el numerador unicamente deberia ir la suma de minutos a celular de las 3 lineas.
     * Preferiblemente a partir del metodo darTotalMinutosCelular.
     * En el denominador deberia ir la cantidad de minutos de la empresa .
     * Se esperaba 0.0, pero usted respondió 100.0
     *
     */
    public double darPorcentajeCelular() {

        int numeroLlamadas = linea1.dartotalMinutosCelular() + linea2.dartotalMinutosCelular() + linea3.dartotalMinutosCelular();

        return (double) numeroLlamadas / numeroLlamadas * 100;
    }







    /**
     * Devuelve el costo total de las llamadas realizadas
     * @return costo total de las tres lineas
     */
    public double datTotalCostoLlamadas() {
        return linea1.costoLlamadas() + linea2.costoLlamadas() + linea3.costoLlamadas();
    }





}

