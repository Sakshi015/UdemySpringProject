package com.udemyproject.spring.steps.Basic;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;


@Component

    public class BinarySearchImpl {
        private Logger logger = LoggerFactory.getLogger(this.getClass());
        @Autowired
        private SortAlgorithm bubbleSortAlgorithm;

        public int binarySearch(int[] numbers,int numbertobesearch){
            int[] sortednumber =bubbleSortAlgorithm.sort(numbers);
            System.out.println(bubbleSortAlgorithm);
            //logic
            return 3;
        }

       // public void postConstruct(){
         //   logger.info("Post Construct");

        //}
        //@PreDestroy
        //public void preDestroy(){
          //  logger.info("Pre Destroy");
        //}


    }
