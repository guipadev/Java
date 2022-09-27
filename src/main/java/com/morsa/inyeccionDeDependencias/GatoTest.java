package com.morsa.inyeccionDeDependencias;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class GatoTest {
    public static void main(String[] args) {

        Veterinario vet = Mockito.mock(Veterinario.class);

        Gato unGato = new Gato(vet, 1, 5);
        // when para falsear el metodo diagnosticar
        when(vet.diagnosticar(unGato)).thenReturn(true);

        assert unGato.esUnGatoSaludable();  // falla si es false

        Gato unGatoMuyViejo = new Gato(vet,16, 5);
        when(vet.diagnosticar(unGatoMuyViejo)).thenReturn(true);

        assert unGatoMuyViejo.esUnGatoSaludable();


    }
}
