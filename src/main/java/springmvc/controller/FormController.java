package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@GetMapping("/form")
	public String showForm() {
		System.out.println("Welcome to Forms...");
		return "form";
	}

	// In this case your data firstly moves from view to controller and then
	// secondly, from controller it goes to view part.
	@PostMapping("/submitform") // path should be same as action in form.jsp file.
	public String formHandler(@RequestParam String userName, @RequestParam String email, @RequestParam String password,
			Model model) {

		System.out.println("User Name : " + userName);
		System.out.println("User Email : " + email);
		System.out.println("User Password : " + password);

		model.addAttribute("name", userName);
		model.addAttribute("email", email);
		model.addAttribute("password", password);

		return "success";

	}
}
