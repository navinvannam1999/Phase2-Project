package org.app.controller;

import java.util.Map;

import org.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UsersController {

	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public String register(Map<String,Object> map) {
		return "user/register";
	}

	@RequestMapping(value = "/details", method=RequestMethod.POST)
	public String details(User user, Map<String,Object> map) {
		
		map.put("fName", user.getfName());
		map.put("lName", user.getlName());
		map.put("email", user.getEmail());
		map.put("mobile", user.getMobile());
		return "user/details";
	}
}
