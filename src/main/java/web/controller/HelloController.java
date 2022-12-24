package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/hello")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I make test");
		messages.add("test is successful");
		messages.add("we add one more line");
		messages.add("OMG! It finally works");
		messages.add("Does it still work?");
		messages.add("One week later..");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}