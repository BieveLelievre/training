package bf.gov.justice.jurisprudencefaso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class JurisprudenceFasoApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = SpringApplication.run(JurisprudenceFasoApplication.class, args);
		// displayAllBeans();
	}

	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			System.out.println(beanName);
		}
	}

}
