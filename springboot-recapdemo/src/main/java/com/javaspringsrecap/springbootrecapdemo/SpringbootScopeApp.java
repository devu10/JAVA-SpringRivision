package com.javaspringsrecap.springbootrecapdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javaspringsrecap.springbootrecapdemo.basic.BinarySearch;
import com.javaspringsrecap.springbootrecapdemo.scope.PersonDAO;

@SpringBootApplication
public class SpringbootScopeApp {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringbootScopeApp.class);  

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringbootScopeApp.class, args);
		
		PersonDAO  personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO  personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		//if we require to get the new instace of the dependency of a bean then we should use proxy in the scpe annotation of the dependency  of the bean
		//in this case the proxy should be used in the jdbcconnectin which is the dependency of the bean PersonDAO 
		

		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
