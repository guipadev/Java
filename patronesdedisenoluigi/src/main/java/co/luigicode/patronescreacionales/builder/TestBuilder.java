package co.luigicode.patronescreacionales.builder;

public class TestBuilder {

    public static void main(String[] args) {

        // Ponemos solo los parametros que necesitamos
        Enemy enemy = Enemy.builder()
                .name("pepe")
                .type("mage")
                .health(100)
                //.damage(100)
                .endurance(100)
                .build();

        System.out.println(enemy.toString());
    }
}
