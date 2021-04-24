package com.udemyproject.spring.steps;

import com.udemyproject.componentscan.ComponentPersonDAO;
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

public class StepsApplicationComponentScan {

	private static Logger LOGGER = LoggerFactory.getLogger(StepsApplicationComponentScan.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(StepsApplicationComponentScan.class);
				//SpringApplication.run(StepsApplicationComponentScan.class, args);

		ComponentPersonDAO componentPersonDAO=applicationContext.getBean(ComponentPersonDAO.class);

		LOGGER.info("{}",componentPersonDAO);
	//	LOGGER.info("{}",componentPersonDAO.getComponentJdbcConnection());
		applicationContext.close();
	}

}
