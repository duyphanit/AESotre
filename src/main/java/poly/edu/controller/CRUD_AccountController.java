package poly.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.entity.Account;
import poly.edu.service.AccountService;

@Controller
@RequestMapping("/accounts")
public class CRUD_AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping
	public String accountIndex(Model model) {
		model.addAttribute("account", new Account());
		model.addAttribute("accounts", accountService.findAll());

		return "account/crud_account";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Account acc = accountService.findById(id);
		if (acc != null) {
			model.addAttribute("account", acc); // gán tài khoản cần sửa
			model.addAttribute("message", "Đã tải tài khoản thành công!");
		} else {
			model.addAttribute("account", new Account()); // fallback nếu không tìm thấy
			model.addAttribute("message", "Không tìm thấy tài khoản!");
		}
		
		model.addAttribute("accounts", accountService.findAll()); // luôn hiển thị danh sách
		return "account/crud_account";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Account account, Model model) {
		accountService.save(account);
		model.addAttribute("message", "Đã lưu tài khoản thành công!");
		return "redirect:/accounts";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		accountService.deleteById(id);
		model.addAttribute("message", "Xóa tài khoản thành công!");
		return "redirect:/accounts";
	}

}
