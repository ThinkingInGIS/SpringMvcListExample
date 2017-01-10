package org.thinkingingis.controller;

import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thinkingingis.service.HelloWorldService;

import ch.qos.logback.classic.Logger;

@Controller
public class WelcomeController {
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(WelcomeController.class);
	private HelloWorldService helloWorldService;
	
	@Autowired
	public WelcomeController(HelloWorldService helloWorldService){
		this.helloWorldService = helloWorldService;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model){
		
		logger.debug("index() method is executed");
		
		model.put("title", helloWorldService.getTitle(""));
		model.put("msg", helloWorldService.getDesc());
		
		return "index";
	}
	
	@RequestMapping(value = "/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name){
		
		logger.debug("hello() is executed - $name {}", name);
			
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("title", helloWorldService.getTitle(name));
		model.addObject("msg", helloWorldService.getDesc());
		model.addObject("list", helloWorldService.getList());
		
		return model;	
	}
	
}
