package com.udemyproject.spring.steps;

import com.udemyproject.spring.steps.Scope.PersonDAO;
import com.udemyproject.spring.steps.cdi.SomeCDIBusiness;
import com.udemyproject.spring.steps.cdi.SomeCDIDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StepsApplicationCdiDao {
	private static Logger LOGGER = LoggerFactory.getLogger(StepsApplicationCdiDao.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(StepsApplicationCdiDao.class);
				//SpringApplication.run(StepsApplicationCdiDao.class, args);

		SomeCDIBusiness business=applicationContext.getBean(SomeCDIBusiness.class);


		LOGGER.info("{} dao{}",business, business.getSomeCDIDAO());

		applicationContext.close();
	}

}
