package springmvc.controller;

//import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class FormController {

	// Using @ModelAttribute outside the method...
	//If we use @ModelAttribute on the top of the method then, your Model object becomes common for all methods... 
	// This method(showCommonData) should be created before the handler method(showForm) so, that it will bind the data before the handler method.
	@ModelAttribute
	public void showCommonData(Model m) {
		m.addAttribute("reg", "Registration Form");
		m.addAttribute("desc", "Login into the football world");
		System.out.println("Adding common data");
	}

	@GetMapping("/form")
	public String showForm() {
		System.out.println("Welcome to Forms...");
		return "form";
	}

	// Using @ModelAttribute inside the method
	@PostMapping("/submitform") // path should be same as action in form.jsp file.
	public String formHandler(@ModelAttribute User user, Model model) {
		System.out.println(user);
		return "success";
	}

	// In this case your data firstly moves from view to controller and then
	// secondly, from controller it goes to view part.

	/*
	 * @PostMapping("/submitform") // path should be same as action in form.jsp
	 * file. public String formHandler(@RequestParam String userName, @RequestParam
	 * String email, @RequestParam String password, Model model) {
	 * 
	 * 
	 * System.out.println("User Name : " + userName);
	 * System.out.println("User Email : " + email);
	 * System.out.println("User Password : " + password);
	 * 
	 * 
	 * User user = new User(); user.setUserName(userName);
	 * user.setPassword(password); user.setEmail(email); System.out.println(user);
	 * model.addAttribute("user", user);
	 * 
	 * 
	 * model.addAttribute("name", userName); model.addAttribute("email", email);
	 * model.addAttribute("password", password);
	 * 
	 * 
	 * return "success";
	 * 
	 * }
	 */

}
