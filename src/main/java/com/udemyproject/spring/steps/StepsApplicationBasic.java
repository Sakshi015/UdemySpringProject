package com.udemyproject.spring.steps;

import com.udemyproject.spring.steps.Basic.BinarySearchImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StepsApplicationBasic {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result= binarySearch.binarySearch(new int[]{12,4,6}, 3);

		try(AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(StepsApplicationBasic.class)) {    //SpringApplication.run(StepsApplicationBasic.class, args);
			//System.out.println(result);
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println(result);
		}

	}

}
