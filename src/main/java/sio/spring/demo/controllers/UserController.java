package sio.spring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("")
	public String index() {
		return "/user/index";
	}

	@GetMapping("/add")
	public String addForm() {
		return "/user/form";
	}

	@PostMapping("/add")
	public String submitForm(@RequestParam String nom, Model model) {
		model.addAttribute("nom", nom);
		return "/user/add";
	}

}
