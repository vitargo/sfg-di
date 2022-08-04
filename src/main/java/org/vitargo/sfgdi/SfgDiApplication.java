package org.vitargo.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.vitargo.sfgdi.controllers.*;

@ComponentScan(basePackages = {"org.vitargo.sfgdi", "org.vitargo.greetings", "org.vitargo.config", "org.vitargo.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.getHello());

		System.out.println("---- i18n ----");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.getHello());

		System.out.println("---- Primary ----");

		System.out.println(myController.getPrimaryGreeting());

		System.out.println("---- Property ----");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---- Setter ----");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---- Constructor ----");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("---- Pet ----");

		PetController petController = (PetController) ctx.getBean("petController");

		System.out.println(petController.whichPetIsTheBest());
	}
}
