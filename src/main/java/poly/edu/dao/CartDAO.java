package poly.edu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.edu.entity.Cart;

public interface CartDAO extends JpaRepository<Cart, Long>{

}
