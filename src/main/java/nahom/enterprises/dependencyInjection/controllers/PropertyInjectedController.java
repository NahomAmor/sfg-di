package nahom.enterprises.dependencyInjection.controllers;

import nahom.enterprises.dependencyInjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingServices greetingServices;
    //uses dependency injection when controller calls a public property in the makeshift IOC/ Test Class where controller and  service method class are instantiated.
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
