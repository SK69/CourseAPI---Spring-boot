package io.shiv.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		//starts the app
		//what is spring appp context?
		//performs class path scan
		//starts tomcat server
		
		SpringApplication.run(CourseApiApp.class, args);
		
	}
	
}
