package portal.shopping.portalshoppingproduct.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portal.shopping.portalshoppingproduct.entity.Category;
import portal.shopping.portalshoppingproduct.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findByCategories(Category category);

	
	List<Product> findByCategoriesId(Long categoryId);
}
