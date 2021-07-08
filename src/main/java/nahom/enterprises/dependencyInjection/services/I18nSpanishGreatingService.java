package nahom.enterprises.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ES")
@Service("I18nService")
public class I18nSpanishGreatingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hola Amor te amo";
    }
}
