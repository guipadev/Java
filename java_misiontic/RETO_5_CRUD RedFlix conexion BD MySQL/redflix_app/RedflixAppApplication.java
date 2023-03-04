package reto5.retflix183.redflix_app;

import reto5.retflix183.redflix_app.vista.Ventana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("reto5.retflix183.redflix_app")
public class RedflixAppApplication {

	public static void main(String[] args) {
            new Ventana().setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(RedflixAppApplication.class, args);
        }                
}
