package io.shiv.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//converts the object returned into JSON
public class TopicController {

	@Autowired//says that this declaration needs dependency injection.
	//tells spring to initialise and inject an instance of this class.
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics()
	{
//		return "All topics";
		return topicService.getAllTopics();
		
	}
	
	//using curly braces says that it is variable, whose name can be anything
	@RequestMapping("/topics/{foo}")
	public Topics getTopic(@PathVariable String Id)//what param you're expecting is in the path
	{
		return topicService.getTopic(Id);
	}
	
}
