package co.yom.gpt.inversiondedependencia.sindip;

public class Switch {
    private LightBulb bulb;

    void connectToBulb(LightBulb bulb) {
        this.bulb = bulb;
    }

    void flip() {
        bulb.turnOn();
    }
}
