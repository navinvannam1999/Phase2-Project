package org.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message","Welcome From Soring MVC");
		
		return "welcome";
	}
	
	@RequestMapping(value="/home/{user}", method=RequestMethod.GET)
	public String sayHelloAgain(@PathVariable("user") String user,ModelMap model) {
		model.addAttribute("message","Welcome Again From Soring MVC");
		
		model.addAttribute("userdata",user);
		return "welcome";
	}

}
