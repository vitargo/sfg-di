package org.vitargo.sfgdi.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository{

    @Override
    public String getGreetingFromRepository() {
        return "Good evening, we are from Ukraine!";
    }
}
