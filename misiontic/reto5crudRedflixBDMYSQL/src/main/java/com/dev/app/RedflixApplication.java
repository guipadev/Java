package com.dev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.app.views.Ventana;

@SpringBootApplication
public class RedflixApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RedflixApplication.class, args);
		new Ventana().setVisible(true);
	}
	
	public static void runSpringServer(String[] args) {
		// ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class).headless(false).run(args);
        SpringApplication.run(RedflixApplication.class, args);
    }

}
