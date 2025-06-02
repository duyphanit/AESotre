package poly.edu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.edu.entity.OrderDetail;
import poly.edu.entity.OrderDetailId;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, OrderDetailId>{

}
