package com.dev.reto2;
public class Candidato {

    private int votos;

    /**
     * 1) Adicione el atributo necesario en la clase Candidato que modele el contador de los votos obtenidos
     * por el medio de comunicación de televisión (votosInfluenciaTelevision).
     * (Nota: Cada vez que se genere un voto por televisión, se debería adicionar al atributo un voto).
     *
     * Número de votos influenciados por televisión
     */
    private static int votosInfluenciaTelevision;


    /**
     * 2) Agregue el método correspondiente para obtener el valor del nuevo atributo creado.
     * Además el método de retorno debe llamarse darVotosInfluenciaTelevision().
     *
     * Devuelve el número de votos influenciados por television.
     * @return número de votos influenciados por television.
     */
    public int darVotosInfluenciaTelevision() {
        return votosInfluenciaTelevision;
    }

    /**
     * 3) Cree, en la clase Candidato, el método inicializarInfluenciaTelevision()
     * para que se asigne un valor de 0 al atributo previamente creado.
     * Este método únicamente modifica los valores del atributo, no debe retornar ningún valor
     *
     * Inicializa los atributos correspondientes a la influencia de los canales de televisión y radio en 0.
     * También puede ser usado para el reinicio de los atributos de votos por influencia de la television
     * y de la radio a su valor inicial.
     */
    public void inicializarInfluenciaTelevision() {
        votosInfluenciaTelevision = 0;
    }

    /**
     * 4) En la clase Candidato cree el método para agregar votos por televisión (agregarVotoInfluenciaTelevision( ))
     * para que aumente el atributo correspondiente. Tenga en cuenta que este método no debe retornar ningún valor.
     *
     * Agrega un voto influenciado por la televisión al atributo correspondiente
     */
    public void agregarVotoInfluenciaTelevision(){
        votosInfluenciaTelevision += 1;
    }

    /**
     * ERROR: El promedio de porcentajes de votos influenciados por television en las elecciones deberia ser 0.0%. Se esperaba 0.0, pero usted respondió 1.0
     * 5) En la clase Candidato, cree un método de nombre darPorcentajeVotosInfluenciaTelevisionCanditato()
     * que retorne el porcentaje de votos que son influenciados por televisión del total de votos que recibió el candidato.
     * Tenga en cuenta que en la clase Candidato existe el atributo votos que lleva la suma total de votos recibidos por el candidato,
     * además el valor de retorno del método debe tener decimales y debe ser porcentual, es decir que debe estar entre 0.0 y 100.0
     * (EJ: 10.1) y de no haber votos el valor por defecto a retornar es 0.0.
     *
     * Devuelve el porcentaje de votos de influencia teniendo en cuenta los votos de televisiÃ³n
     * sobre el total de votos recibidos.
     * @return procentaje de votos total que fueron recibidos por television
     */
    public double darPorcentajeVotosInfluenciaTelevisionCanditato( ) {
        double porcentaje;

        porcentaje = ((double) votosInfluenciaTelevision / votos) * 100;

        return porcentaje;
    }

}
