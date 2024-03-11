package com.javaspringsrecap.springbootrecapdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootRecapdemoApplication {

	public static void main(String[] args) {
		
		//what are the beans : put @Components for the spring framework to identify the beans
		//what are the dependencies of the beans? Put @Autowired for spring framework to identify the dependencies 
		//where to search the beans? put @SpringBootApplicaiton for the spring framework to look for the beans and dependencies int he packages
		
		//below cant be done in more dynamic way
		/*BinarySearch binarysearch = new BinarySearch(new BubbleAlgo());
		int result = binarysearch.binarySearchAl(new int[] {12,4,6,3,1},1);
		System.out.println(result);*/
		
		
		//Applicaiton context
		ApplicationContext applicationContext = SpringApplication.run(SpringbootRecapdemoApplication.class, args);
		//get the binary seach from the applicaiton context
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		
		int result = binarySearch.binarySearchAl(new int[] {12,4,6,1,5},1);
		System.out.println(result);
		
		
	}

}
