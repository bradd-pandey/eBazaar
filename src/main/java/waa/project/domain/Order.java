package waa.project.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity(name="cart")
public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String customerId; 	
//	@NotEmpty
//	@Range(min=16, max=16, message="{Order.cardNumber.validation}")
	private String cardNumber;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@Valid
	private Address shippingAddress;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Column(name="OrderLine")
	private List<OrderLine> orderLineList = new ArrayList<OrderLine>();
	
	/*@Temporal
	private Date orderDate;
	private Date shippingDate;*/
	
	public Order(){
		this.shippingAddress= new Address();
	}
	
	
	
	public String getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public List<OrderLine> getOrderLineList() {
		return orderLineList;
	}
	public void setOrderLineList(List<OrderLine> orderLineList) {
		this.orderLineList = orderLineList;
	}
	/*public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}*/
	
	public void addOrderLine(OrderLine orderLine){
		this.orderLineList.add(orderLine);
	}
	
	public double getTotalPrice(){
		double sum =0;
		for(OrderLine ol:orderLineList){
			sum += ol.getSubTotal();
		}
		return sum;
	}



	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", cardNumber=" + cardNumber + ", shippingAddress="
				+ shippingAddress + ", orderLineList=" + orderLineList + "]";
	}
	
	

}
