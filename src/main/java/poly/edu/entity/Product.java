package poly.edu.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String productID;

	private String productName;
	private Double firstPrice;
	private String images;

	@ManyToOne
	@JoinColumn(name = "categoryID")
	private Category category;

	@OneToMany(mappedBy = "product")
	private List<Cart> carts;

	@OneToMany(mappedBy = "product")
	private List<OrderDetail> orderDetails;
}
