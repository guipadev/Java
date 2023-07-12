package makingas.overwrite;

public class Perro extends Animal {

    /**
     * Se utiliza para comprobar y da seguridad, si realmente estamos extendiendo un
     * método de la clase superior
     * Override es una anotación que cuando se compila el código se evalue
     * Si realmente estamos extendiendo un método o No
     */
    @Override
    public void sonido() {
        System.out.println("El perro hace Gua gua");
    }

}