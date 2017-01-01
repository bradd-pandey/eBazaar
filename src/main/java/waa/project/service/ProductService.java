package waa.project.service;

import java.util.List;

import waa.project.domain.Product;

public interface ProductService {
	
	/*public Product getProductbyId(String id);*/
	public Product findProductbyId(Integer value);
	
	void addProduct(Product product);
	public List<Product> getallProducts();
	

}
