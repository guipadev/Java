package com.charlycimino.$50diferenciaEntreTHROWyTHROWS;

public class Verificador {

    public static void checkeEsNegativo(int x) {
        if (x < 0) {
            // para lanzar una excepcion se utiliza la palabra THROW(lanzar)
            throw new RuntimeException("No puede ser negativo");
        }
    }

    // Al ser una excepcion chequeado por el compilador se debe usar THROWS(lanza), Este metodo lanza un excepcion
    public static void checkeEsNegativo2(int x) throws Exception {
        if (x < 0) {
            // para lanzar una excepcion se utiliza la palabra THROW
            throw new Exception("No puede ser negativo");
        }
    }
}
