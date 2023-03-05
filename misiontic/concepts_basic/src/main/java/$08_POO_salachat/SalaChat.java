//package POO_salachat;


public class SalaChat {

    public static void main(String[] args) throws InterruptedException {
        UsuarioNormal u1 = new UsuarioNormal("Nata", "na@gmail.com", "123456", "password");
        UsuarioNormal u2 = new UsuarioNormal("Erika", "eriketa@outlook.es", "654321", "password");

        u1.chatear(u2, "Hola Erika");
        Thread.sleep(1000);//se demore un seg. entre un chat y otro chat
        u2.chatear(u1, "Hola Nata, me alegra saber de ti");
    }

}