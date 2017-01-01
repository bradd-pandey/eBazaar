package waa.project.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import waa.project.domain.Category;
import waa.project.domain.Product;
import waa.project.service.CategoryService;
import waa.project.service.ProductService;

@Controller
@RequestMapping("/product")

public class ProductController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value={"","/showProduct"}, method = RequestMethod.GET)
	public ModelAndView  showWelcomeProduct(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("products", productService.getallProducts());
		modelAndView.setViewName("products");
		return modelAndView;
	}
	
	@RequestMapping("/productDetail")
	public String getProductById(Model model, @RequestParam("id") Integer productId) {
		Product product = productService.findProductbyId(productId);
		model.addAttribute("product", product);
		return "productDetails";
	}
		
			
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newProduct")Product product,Model model) {
		List<Category> categories = categoryService.getAllCategory();
		model.addAttribute("categories",categories);
	   return "productForm";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String saveProduct(@Valid @ModelAttribute("newProduct")Product product,BindingResult result,HttpServletRequest request){
		if(result.hasErrors()){
			return "productForm";
		}
		MultipartFile productImage = product.getProductImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		if (productImage!=null && !productImage.isEmpty()) {
		       try {
		      	productImage.transferTo(new File(rootDirectory+"\\resources\\images\\"+product.getProductId() + ".png"));
		       } catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
		   }
		
	}
		System.out.println(product.getName() );
		productService.addProduct(product);
		System.out.println(product.getName() );
		return "redirect:/product";
	}
}
	

