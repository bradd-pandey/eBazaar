package waa.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import waa.project.domain.Product;
import waa.project.repository.ProductRepository;
import waa.project.service.ProductService;

@Service
@Transactional

public class ProductServiceImpl implements ProductService {
	
	/*@Autowired
	private ProductRepository productRepository;*/

	/*@Override
	public Product getProductbyId(String id) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	/*@Override
	public Product getProductbyId(String id) {
		
		return productRepository.getProductById(id) ;
	}*/

}
