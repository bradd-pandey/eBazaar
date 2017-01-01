package waa.project.webflow;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import waa.project.domain.Order;
import waa.project.service.OrderService;

@Component
public class OrderControllerHelper {
	
	@Autowired
	OrderService orderService;
	
	public void saveOrder(Order order) {
		
		orderService.saveOrder(order);
	}
	
	public Order addItemsToOrder(Order order,HttpSession session){
		Order mycart = (Order)session.getAttribute("myCart");
		if(mycart != null){
			
			order.setOrderLineList(mycart.getOrderLineList());
			session.removeAttribute("myCart");
		}
		
		return order;
	}

}
