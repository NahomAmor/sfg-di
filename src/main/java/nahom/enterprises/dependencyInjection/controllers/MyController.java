package nahom.enterprises.dependencyInjection.controllers;

import nahom.enterprises.dependencyInjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingServices greetingServices;

    MyController(GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }
    public String sayHello(){
//        System.out.println("hello World!!!");
        return greetingServices.sayGreeting();
    }
}
