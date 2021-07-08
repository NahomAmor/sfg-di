package nahom.enterprises.dependencyInjection.controllers;

import nahom.enterprises.dependencyInjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingService());
    }
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}