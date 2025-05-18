package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexcontroller {
	@RequestMapping("/home")
	public String indexcontroller() {
		return "index";
	}
}
