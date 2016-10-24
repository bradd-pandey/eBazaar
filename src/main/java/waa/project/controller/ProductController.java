package waa.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import waa.project.domain.Product;

@Controller

public class ProductController {
	
	@RequestMapping(value="/showProduct", method = RequestMethod.GET)
	public String showWelcomeProduct(){
		System.out.println("Hello");
		return null;
	}
			
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
		System.out.println("Come here");
	   return "addProduct";
	}
	

}
