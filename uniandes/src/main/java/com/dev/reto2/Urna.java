package com.dev.reto2;

/**
 * ERROR: Deberia tener 0.0% voto influenciado por television.. Se esperaba 0.0, pero usted respondió NaN
 * 6) En la clase Urna, cree el método darPromedioPorcentajeVotosInfluenciaTelevisionRadioCandidatos()
 * para que devuelva el porcentaje promedio de votos que los candidatos recibieron por influencia de la televisión.
 * Tenga en cuenta que dentro de la aplicación existen tres candidatos candidato1, candidato2, y candidato3
 * y el valor de retorno del método debe tener decimales y ser porcentual,
 * es decir que debe estar entre 0.0 y 100.0 (EJ: 10.1).
 */
public class Urna {

    Candidato candidato1 = new Candidato();
    Candidato candidato2 = new Candidato();
    Candidato candidato3 = new Candidato();

    /**
     * Devuelve el promedio de porcentaje de influencia de votos de television para todos los candidatos.
     * @return promedio del porcentaje de votos influenciados por televisiÃ³n para todos los candidatos.
     */
    public double darPromedioPorcentajeVotosInfluenciaTelevisionRadioCandidatos() {

        double total;

        double promedio;

        total = candidato1.darVotosInfluenciaTelevision() + candidato2.darVotosInfluenciaTelevision() + candidato3.darVotosInfluenciaTelevision();

        promedio = total / 3;

        return promedio;

    }

}
