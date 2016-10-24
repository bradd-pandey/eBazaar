package waa.project.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import waa.project.domain.Order;
import waa.project.domain.OrderLine;
import waa.project.domain.TestProduct;
import waa.project.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	List<TestProduct>pList=new ArrayList<TestProduct>();
	
	OrderServiceImpl(){
		pList.add(new TestProduct(1,"p1",20.0));
		pList.add(new TestProduct(2,"p2",10.0));
		pList.add(new TestProduct(3,"p3",60.0));
	}
	
	public TestProduct getProduct(int ProductId){
		for (TestProduct p : pList) {
			if(p.getId()==ProductId){
				return p;
			}
		}
		return null;
	}

	public void addToCart(OrderLine orderLine, HttpServletRequest request){
		
		HttpSession session= request.getSession();
		Order order = (Order)session.getAttribute("myCart");
		
		if(order == null){
			order= new Order();
			session.setAttribute("myCart", order);
		}
		TestProduct product =this.getProduct(orderLine.getProductId()); 
		orderLine.setProduct(product);
		order.addOrderLine(orderLine);		
	}
	
//	public double subtotal(OrderLine orderLine){
//		
//		TestProduct product =this.getProduct(orderLine.getProductId()); 		
//		return orderLine.getQuantity()*product.getPrice();
//		
//	}
}
