package HerenciayPolimorfismo.Electrodomestico;


public class PortatilPc extends Portatil{

    @Override
    public void conectarWifi() {
        System.err.println("Soy un PC y me conecté al WIFI");
    }
    

}
