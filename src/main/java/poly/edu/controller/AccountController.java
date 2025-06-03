package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
	@RequestMapping("/account/login")
	public String doLogin() {
		return "/account/login";
	}
	
	@RequestMapping("/account/loginDB")
	public String doLogin_DB() {
		return "/account/login";
	}
	
	@RequestMapping("/account/register")
	public String doRegister() {
		return "/account/register";
	}
	
	@RequestMapping("/account/registerDB")
	public String doRegister_DB() {
		return "/account/register";
	}

}
