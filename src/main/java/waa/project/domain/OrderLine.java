package waa.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class OrderLine {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	private int productId;
	private int quantity = 1;
	
	@Transient
	private TestProduct product;

//	private double subTotal = quantity * product.getPrice();
	
	public int getId() {
		return id;
	}	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;	
	}
	public TestProduct getProduct() {
		return product;
	}
	public void setProduct(TestProduct product) {
		this.product = product;
	}
//	public double getSubTotal() {
//		return subTotal;
//	}
//	public void setSubTotal(double subTotal) {
//		this.subTotal = subTotal;
//	}

	@Override
	public String toString() {
		return "OrderLine [productId=" + productId + ", quantity=" + quantity + ", product="
				+ product + "]";
	}
	
}
