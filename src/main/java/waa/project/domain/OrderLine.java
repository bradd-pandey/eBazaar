package waa.project.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class OrderLine implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	private int productId;

	private int quantity;
	
	@Transient
	private Product product;
	
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderLine [productId=" + productId + ", quantity=" + quantity + ", product="
				+ product + "]";
	}
	
	public double getSubTotal(){
		return quantity*this.product.getPrice();
	}
	
}
