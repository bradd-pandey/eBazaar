package waa.project.domain;

import java.util.List;

public class Order {
	private int id;
	private String customerId; // Customer domain
	private Address shippingAddress;
	private List<OrderLine> orderList;
	

}
