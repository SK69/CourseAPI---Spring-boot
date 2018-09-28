package io.shiv.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//from spring mvc 
public class HelloController {

	//whenever a request in the app is made to /hello, execute this
	@RequestMapping("/hello")
	public String sayHI()
	{
		return "HI!";
		
	}
	
}
