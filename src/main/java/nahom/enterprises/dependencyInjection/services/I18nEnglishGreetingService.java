package nahom.enterprises.dependencyInjection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello Leul, Do better";
    }
}
