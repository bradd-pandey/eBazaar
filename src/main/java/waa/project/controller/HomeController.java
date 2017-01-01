package waa.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
	public String homePage(Model model) {
		
		return "welcome";
	}
		
}
