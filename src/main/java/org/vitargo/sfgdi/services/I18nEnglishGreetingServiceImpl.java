package org.vitargo.sfgdi.services;

import org.vitargo.sfgdi.repository.EnglishGreetingRepository;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {

    EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingServiceImpl(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String getGreeting() {

        return englishGreetingRepository.getGreetingFromRepository();
    }
}
