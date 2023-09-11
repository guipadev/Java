package co.yom.thecodercave.liskovsubstitutionprinciple.lsp;

/**
 * Ahora se cumple con el principio LSP
 * Ya que nuestra clase solo implementa las interfaces para el uso metodos necesarios
 */
public class Plane implements ITakeOff, ILand {
    @Override
    public void Land() {
        // Despegar
    }

    @Override
    public void TakeOff() {
        // Aterrizar
    }
}
