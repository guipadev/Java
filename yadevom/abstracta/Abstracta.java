package abstracta;

public abstract class Abstracta {

    public void exampleMethod() {
        System.out.println("Soy un metodo de la clase abstracta");
    }

    // Metodos abstracto no deben tener cuerpo, la logica la da clase hija que hereda
    // Aqui no se puede tener ningun tipp de cuerpo
    public abstract void ejemploMetodoAbstracto();

}
