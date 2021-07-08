package nahom.enterprises.dependencyInjection.services;


import org.springframework.stereotype.Service;
// spring steriotype to identify class as a spring managed component (Identical functionality to Controller annotation)
@Service
public class ConstructorGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
