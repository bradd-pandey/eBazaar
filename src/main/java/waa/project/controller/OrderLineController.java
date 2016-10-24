/*package waa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import waa.project.domain.OrderLine;
import waa.project.service.OrderLineService;

@Controller
@RequestMapping("/orderLine")
public class OrderLineController {
	
	@Autowired
	OrderLineService orderLineService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public void myOrderLine(Model model){
		
		OrderLine orderLine = orderLineService.addOrderLine();
		model.addAttribute("orderLine", orderLine);
				
	}

}
*/