package hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
    	System.out.println("index");
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/help")
    public String help() {
    	System.out.println("help");
        return "Greetings from Spring Boot!";
    }

}
