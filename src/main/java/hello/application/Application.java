package hello.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import hello.controllers.HelloController;


@SpringBootApplication
@ComponentScan( basePackages ="hello.*")
public class Application {

	public static void main(String[] args) {			
		SpringApplication.run(Application.class, args);
	}
	
	
	  
}
