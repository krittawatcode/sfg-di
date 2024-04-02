package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don't let friends use property injection!";
    }
}
