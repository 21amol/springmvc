package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// Using Model...
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Welcome to Home...");

		model.addAttribute("name", "Amol Ghotale");
		model.addAttribute("jersey", 21);

		List<String> players = new ArrayList<String>();
		players.add("Puyol");
		players.add("Messi");
		players.add("Ronaldo");
		players.add("Ozil");
		model.addAttribute("p", players);

		return "home"; // This is your .jsp file in view folder...
	}

	@GetMapping("/about")
	public String about() {
		System.out.println("Welcome to About...");
		return "about";
	}

	@GetMapping("/help")
	public String help() {
		System.out.println("Welcome to Help...");
		return "help";
	}

	// Using ModelAndView
	@GetMapping("/services")
	public ModelAndView services() {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Welcome to services...");

		// setting the data...
		modelAndView.addObject("service", "Fitness and Healthy Lifestyle");
		modelAndView.addObject("date", 10);

		List<Integer> batches = new ArrayList<Integer>();
		batches.add(15);
		batches.add(20);
		batches.add(25);
		modelAndView.addObject("b", batches);

		// setting the view name...
		modelAndView.setViewName("services");

		// object of ModelAndView returned...
		return modelAndView;
	}
}
