package org.thinkingingis.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import ch.qos.logback.classic.Logger;

@Service
public class HelloWorldService {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(HelloWorldService.class);
	
	public String getDesc(){
		logger.debug("getDesc() is executed!");
		return "[Maven + Spring MVC + Bootstrap + List] Example";
	}
	
	public String getTitle(String name){
		logger.debug("getTitle() is executed! $name : {}", name);
		if(StringUtils.isEmpty(name)){
			return "Hello ThinkingInGIS";
		}else {
			return "Hello " + name;
		}
	}
	
	public List<String> getList(){
		List<String> list = new ArrayList<String>();
		list.add("List M");
		list.add("List A");
		list.add("List P");
		list.add("List S");
		
		list.add("List C");
		list.add("List A");
		list.add("List N");
		
		list.add("List T");
		list.add("List A");
		list.add("List L");
		list.add("List K");
		
		return list;
	}
}
