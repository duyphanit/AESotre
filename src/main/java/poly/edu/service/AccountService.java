package poly.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.edu.dao.AccountDAO;
import poly.edu.entity.Account;

@Service
public class AccountService {
	@Autowired
	AccountDAO accountDAO;

	public List<Account> findAll() {
		return accountDAO.findAll();
	}
	
	public Account save(Account acc) {
		return accountDAO.save(acc);
	}
	
	public Account findById(Long id) {
		return accountDAO.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		accountDAO.deleteById(id);
	}
}
