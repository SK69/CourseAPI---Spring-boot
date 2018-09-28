package io.shiv.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topics> topicsList = Arrays.asList(new Topics("Spring", "Spring F/W", "WOw"),
			new Topics("not spring", "hehe F/W", "WOw"),
			new Topics("ASP.NEt", "haha F/W", "WOw"));
	
	public List<Topics> getAllTopics()
	{
			return topicsList;
		
	}
	
	public Topics getTopic(String Id)
	{
		return topicsList.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
		
	}
	
}
