package poly.edu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.edu.entity.Orders;

public interface OrdersDAO extends JpaRepository<Orders, String>{

}
