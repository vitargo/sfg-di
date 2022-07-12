package org.vitargo.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting() {
        return "Good evening, we are from Ukraine!";
    }
}
