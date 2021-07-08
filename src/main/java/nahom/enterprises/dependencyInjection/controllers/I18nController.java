package nahom.enterprises.dependencyInjection.controllers;

import nahom.enterprises.dependencyInjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingServices greetingServices;

    public I18nController(@Qualifier("I18nService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
