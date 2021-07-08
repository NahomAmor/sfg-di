package nahom.enterprises.dependencyInjection.controllers;

import nahom.enterprises.dependencyInjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//simulating the actions taking place during Inversion of Control
class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        //Spring creates instances and keeps tabs on objects for you
        controller = new PropertyInjectedController();
        //The greeting interface allows for abstraction that gives flexability of different forms of implementation through inheratence(Implements) without altering core objective of the parent class.
        //Controller must have greetingServices property as public in order to directly Instantiate and execute the Objects implemented Method.
        controller.greetingServices = new ConstructorGreetingService();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}