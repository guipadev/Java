package usoFinal;

// Si pusieramos la clase como FINAL no se podria heredar
public class EjemploClase {

    // El valor obtenido no se modifica
    public void ejemploMetodo(final int ejemploVariable) {

        // si queremos cambiar el valor recibido debe ser desde otra variable
        int ejemploVariable2 = ejemploVariable;
        ejemploVariable2 = 2;

        if (ejemploVariable > 0) {

        }
    }

    // Uso palabra final en metodos, hara que este metodo no pueda ser sobreescribido
    final public void ejemploMetodoFinal(final int ejemploVariable) {

    }
}
