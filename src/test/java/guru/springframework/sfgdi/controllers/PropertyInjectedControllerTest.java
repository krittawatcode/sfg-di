package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new PropertyInjectedController();
//        controller.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}