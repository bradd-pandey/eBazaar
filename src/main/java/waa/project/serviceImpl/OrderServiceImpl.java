package waa.project.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import waa.project.domain.Order;
import waa.project.domain.OrderLine;
import waa.project.domain.Product;
import waa.project.repository.OrderRepository;
import waa.project.service.OrderService;
import waa.project.service.ProductService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ProductService productService;

	public void addToCart(OrderLine orderLine, HttpServletRequest request) {

		HttpSession session = request.getSession();
		Order order = (Order) session.getAttribute("myCart");

		if (order == null) {
			order = new Order();
			session.setAttribute("myCart", order);
		}

		Product product = productService.findProductbyId(orderLine.getProductId());
		orderLine.setProduct(product);

		order.addOrderLine(orderLine);
	}

	@Override
	public void saveOrder(Order order) {
		orderRepository.save(order);

	}

	@Override
	public void removeFromCart(int productId, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		Order order = (Order) session.getAttribute("myCart");
        
		List<OrderLine>orderLineList = order.getOrderLineList();
		
        if (order != null && orderLineList.size()>0) {
			for(OrderLine o : orderLineList){
				if(o.getProductId() == productId){
					orderLineList.remove(o);
					break;
				}
			}
		}
		
	}
}
