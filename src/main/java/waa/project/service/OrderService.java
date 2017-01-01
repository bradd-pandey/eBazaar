package waa.project.service;

import javax.servlet.http.HttpServletRequest;

import waa.project.domain.Order;
import waa.project.domain.OrderLine;

public interface OrderService {

	public void addToCart(OrderLine orderLine, HttpServletRequest request);

	public void saveOrder(Order order);
	
	public void removeFromCart(int ProductId, HttpServletRequest request);

}
