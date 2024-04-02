package guru.springframework.sfgdi.services.i18n;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
