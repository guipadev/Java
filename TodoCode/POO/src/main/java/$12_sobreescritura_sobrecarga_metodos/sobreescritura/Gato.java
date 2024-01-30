package $12_sobreescritura_sobrecarga_metodos.sobreescritura;

public class Gato extends Animal {

    // Aunque no hay necesidad de poner la anotación @Override
    // La buena práctica es implementarlo, para indicar la sobre escritura
    @Override
    public void hacerSonido() {
        System.out.println("Soy un gato y hago: Miau miau");   
    }
    
}
