package org.vitargo.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Profile;
import org.vitargo.pets.CatPetService;
import org.vitargo.pets.DogPetService;
import org.vitargo.pets.PetService;
import org.vitargo.pets.PetServiceFactory;
import org.vitargo.sfgdi.repository.EnglishGreetingRepository;
import org.vitargo.sfgdi.repository.EnglishGreetingRepositoryImpl;
import org.vitargo.sfgdi.services.ConstructorGreetingServiceImpl;
import org.vitargo.sfgdi.services.I18nEnglishGreetingServiceImpl;
import org.vitargo.sfgdi.services.I18nUkrainianGreetingServiceImpl;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }
    @Profile({"cat", "default"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"UA", "default"})
    @Bean("i18nService")
    I18nUkrainianGreetingServiceImpl i18nUkrainianGreetingService(){
        return new I18nUkrainianGreetingServiceImpl();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingServiceImpl i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingServiceImpl(englishGreetingRepository);
    }

    @Bean
    ConstructorGreetingServiceImpl constructorGreetingServiceImpl(){
        return new ConstructorGreetingServiceImpl();
    }
}
