package org.vitargo.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import org.vitargo.pets.PetService;
import org.vitargo.pets.PetServiceFactory;
import org.vitargo.sfgdi.datasource.FakeDataSource;
import org.vitargo.sfgdi.repository.EnglishGreetingRepository;
import org.vitargo.sfgdi.repository.EnglishGreetingRepositoryImpl;
import org.vitargo.sfgdi.services.ConstructorGreetingServiceImpl;
import org.vitargo.sfgdi.services.I18nEnglishGreetingServiceImpl;
import org.vitargo.sfgdi.services.I18nUkrainianGreetingServiceImpl;

//@PropertySource("classpath:datasource.properties")
@EnableConfigurationProperties(SfgConstructorConfiguration.class)
@ImportResource("classpath:sfg-di-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${vs.username}") String username,
                                  @Value("${vs.password}")String password,
                                  @Value("${vs.jdbcurl}")String jdbcurl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile({"cat", "default"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"UA", "default"})
    @Bean("i18nService")
    I18nUkrainianGreetingServiceImpl i18nUkrainianGreetingService() {
        return new I18nUkrainianGreetingServiceImpl();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingServiceImpl i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingServiceImpl(englishGreetingRepository);
    }

    //    @Bean
    ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
        return new ConstructorGreetingServiceImpl();
    }
}
