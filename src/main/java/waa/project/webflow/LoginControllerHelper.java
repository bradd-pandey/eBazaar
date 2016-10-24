/*package waa.project.webflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mum.edu.domain.User;
import mum.edu.service.UserService;

@Component
public class LoginControllerHelper {
	@Autowired
	UserService userService;

	public String validateUser(User loginUser) {
		User user = userService.findByName(loginUser.getName());

		if (user == null || !user.getPassword().equals(loginUser.getPassword())) {

			return "false";
		}
		return "true";
	}
	
}
*/