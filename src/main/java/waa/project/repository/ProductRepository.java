package waa.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import waa.project.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	 void addProduct(Product product);
	
	 /*@Query("SELECT p FROM Product p where productId = :productId")
	 Product getProductById(@Param("productId") String key);*/
		
	
}
