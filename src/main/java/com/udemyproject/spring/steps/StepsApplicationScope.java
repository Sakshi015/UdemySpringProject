package com.udemyproject.spring.steps;

import com.udemyproject.spring.steps.Basic.BinarySearchImpl;
import com.udemyproject.spring.steps.Scope.PersonDAO;
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
public class StepsApplicationScope {
	private static Logger LOGGER = LoggerFactory.getLogger(StepsApplicationScope.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(StepsApplicationScope.class);
				//SpringApplication.run(StepsApplicationScope.class, args);

		PersonDAO personDAO1=applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2=applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());

		applicationContext.close();

	}

}
