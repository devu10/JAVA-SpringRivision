package com.javaspringsrecap.springbootrecapdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javaspringsrecap.springbootrecapdemo.basic.BinarySearch;

@SpringBootApplication
public class SpringbootScopeApp {

	public static void main(String[] args) {
		
		//what are the beans : put @Components for the spring framework to identify the beans
		//what are the dependencies of the beans? Put @Autowired for spring framework to identify the dependencies 
		//where to search the beans? put @SpringBootApplicaiton for the spring framework to look for the beans and dependencies int he packages
		
		//below cant be done in more dynamic way
		/*BinarySearch binarysearch = new BinarySearch(new BubbleAlgo());
		int result = binarysearch.binarySearchAl(new int[] {12,4,6,3,1},1);
		System.out.println(result);*/
		
		
		//Applicaiton context
		ApplicationContext applicationContext = SpringApplication.run(SpringbootScopeApp.class, args);
		//get the binary seach from the applicaiton context
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
		//by deafult the scope of bean is singleton, meaning if we try rquesting bean multiple time for same instantiated bean we get same
		//but if we use the annocation @Scope with prototype then we get two deffernt beans.
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearchAl(new int[] {12,4,6,1,5},1);
		System.out.println(result);
		
		
	}

}
