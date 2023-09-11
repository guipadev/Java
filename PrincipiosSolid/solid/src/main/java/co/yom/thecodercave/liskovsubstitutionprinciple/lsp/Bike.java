package co.yom.thecodercave.liskovsubstitutionprinciple.lsp;

/**
 * Ahora se cumple con el principio LSP
 * Ya que nuestra clase solo implementa las interfaces para el uso metodos necesarios
 */
public class Bike implements ISpeed, IBrake, IPark {
    @Override
    public void Brake() {
        // Frenar
    }

    @Override
    public void Park() {
        // Parquear
    }

    @Override
    public void Speed() {
        // Acelerar
    }
}
