package waa.project.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import waa.project.domain.Product;
import waa.project.service.ProductService;


public class ProductIdValidator implements ConstraintValidator<ProductId, Integer>{
	
	@Autowired
	private ProductService productService;

	public void initialize(ProductId constraintAnnotation) {
	
	}

	public boolean isValid(Integer value, ConstraintValidatorContext context){
		Product product;
		try {
			//product = productService.getProductbyId(value);
		product = productService.findProductbyId(value);
		
			
			
		} catch (Exception e) {
			return true;
		}
		
		if(product!= null) {
			return false;
		}
		
		return true;
	}
	
}
