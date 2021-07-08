package nahom.enterprises.dependencyInjection.controllers;

import nahom.enterprises.dependencyInjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingServices greetingServices;
    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingServices(GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
