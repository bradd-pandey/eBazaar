package waa.project.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import waa.project.domain.OrderLine;
import waa.project.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/addToCart", method= RequestMethod.POST)
	public @ResponseBody OrderLine addToCart(@RequestBody OrderLine orderLine, HttpServletRequest request){

		orderService.addToCart(orderLine, request);
		return orderLine;
	}
	
	@RequestMapping(value="/removeFromCart", method= RequestMethod.GET)
	public @ResponseBody void removeFromCart(@RequestParam("productId") int productId, HttpServletRequest request){
		
		System.out.println(productId);
		orderService.removeFromCart(productId, request);
	}
	
	@RequestMapping(value="/showCart", method= RequestMethod.GET)
	public String showCart(){
				
		return "myCart";
	}
	
}
