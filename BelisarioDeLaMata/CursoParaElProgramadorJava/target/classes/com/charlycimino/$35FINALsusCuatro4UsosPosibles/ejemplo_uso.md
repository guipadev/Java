# 'final' para variables locales
## En variables para convertirtas en constantes

final int MIN_VALOR = 2;

# 'final' para atributos
## Al anteponer se convierte en constante y debe declararse un valor inicial obligatoriamente

private final int numero;

# 'final' para clases
## Esta clase no puede heredarse, no puede extenderse por ende no puede tener hijos
## Osea que la jerarquia queda hasta ahí
## No se puede colocar final a una clase abstracta

public final class Carta {
}

# 'final' para métodos
## Al anteponer al método final, No se podra sobre escribir el método
## Tampoco utilizar final abstract, ya que el abstracto es para obligar a clases que lo sobre/escriba

public final String getRepresentacion() {
    return "carta generica";
}