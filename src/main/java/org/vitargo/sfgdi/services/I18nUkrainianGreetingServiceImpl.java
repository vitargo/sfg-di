package org.vitargo.sfgdi.services;

//@Profile({"UA", "default"})
//@Service("i18nService")
public class I18nUkrainianGreetingServiceImpl implements GreetingService {

    @Override
    public String getGreeting() {
        return "Доброго вечора, ми з України";
    }
}
