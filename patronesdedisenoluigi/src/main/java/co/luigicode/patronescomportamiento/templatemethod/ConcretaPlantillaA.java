package co.luigicode.patronescomportamiento.templatemethod;

public class ConcretaPlantillaA extends Plantilla {
    @Override
    public void step1() {
        System.out.println("step 1 class A");
    }

    @Override
    public void step2() {
        System.out.println("step 2 class A");
    }

    @Override
    public void stepN() {
        System.out.println("step N class A");
    }
}
