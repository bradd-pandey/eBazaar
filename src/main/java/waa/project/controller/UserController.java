package waa.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import waa.project.domain.User;
import waa.project.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/userinput", method = RequestMethod.GET)
	public String inputCustomer(@ModelAttribute("user") User user) {
		
		return "addUser";
	}

	@RequestMapping(value = "/user_save", method = RequestMethod.POST)
	public String saveCustomer(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redir) {

		if (bindingResult.hasErrors()) {
			return "addUser";
		}

		userService.save(user);
		redir.addFlashAttribute("user", user);

		return "redirect:/userDetails";
	}
	
	@RequestMapping(value = "/userDetails",  method = RequestMethod.GET)
	public String userDetails() {
		
		return "userDetails";

	}

	@RequestMapping(value = "/user")
	public String getUserByFirstName(Model model, @RequestParam("firstName") String firstName) {

		User user = userService.getUserByFirstName(firstName);
		model.addAttribute("user", user);
		return "userDetails";

	}

}
