package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class HomeController {

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

		return "index";
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
}
