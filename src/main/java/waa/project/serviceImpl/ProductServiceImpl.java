package waa.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import waa.project.domain.Product;
import waa.project.repository.ProductRepository;
import waa.project.service.ProductService;

@Service
@Transactional

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		
		productRepository.save(product);
		
	}

	@Override
	public List<Product> getallProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products ;
	}

	@Override
	/*public Product getProductbyId(String id) {*/
	public Product findProductbyId(Integer id) {
	
		
		/*return productRepository.getProductById(id) ;*/
		Integer pId = (Integer) id;
		System.out.println(productRepository.findProductById(pId));
		return productRepository.findProductById(pId) ;
		
		
	}
	
	

}
