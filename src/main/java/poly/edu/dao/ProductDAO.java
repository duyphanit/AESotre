package poly.edu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.edu.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Long>{
	List<Product> findByCategory_Id(Long categoryId);
}
