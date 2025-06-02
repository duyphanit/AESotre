package poly.edu.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OrderDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(OrderDetailId.class)
public class OrderDetail implements Serializable {
	@Id
	private String orderID;

	@Id
	private String productID;

	private Integer quantity;
	private Double lastPrice;
	private Double total;

	@ManyToOne
	@JoinColumn(name = "orderID", insertable = false, updatable = false)
	private Orders order;

	@ManyToOne
	@JoinColumn(name = "productID", insertable = false, updatable = false)
	private Product product;
}
