package nahom.enterprises.dependencyInjection;

import nahom.enterprises.dependencyInjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);


		System.out.println("---------- Profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("---------- Primary");
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		System.out.println("---------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		//spring doesnt know that its supposed to be injecting the Greeting service unless Distinctly annotated as Autowired in respective Controller
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("---------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		//spring doesnt know that its supposed to be injecting the Greeting service into setter method unless Distinctly annotated as Autowired on setter Method using injection
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("---------- Constructor ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		//spring  know that its supposed to be injecting the Greeting service into the constructor of a controller
		System.out.println(constructorInjectedController.getGreeting());
	}

}
