package org.vitargo.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"UA", "default"})
@Service("i18nService")
public class I18nUkrainianGreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting() {
        return "Доброго вечора, ми з України";
    }
}
