package sio.spring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	// Déclaration d'une route
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "Hello world";
	}

	// Route avec paramètre variable
	@GetMapping("/test/{message}")
	@ResponseBody
	public String testMessage(@PathVariable String message) {
		return "Message : " + message;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/{msg}/index")
	public String indexMessage(@PathVariable String msg) {
		return "index";
	}

	@GetMapping("/items/{numero}")
	public String items(@PathVariable int numero) {
		return "item";
	}

	@PostMapping("/items")
	public String itemsSubmit(@RequestParam int numero, Model model) {
		model.addAttribute("numero", numero);
		return "item";
	}
}
