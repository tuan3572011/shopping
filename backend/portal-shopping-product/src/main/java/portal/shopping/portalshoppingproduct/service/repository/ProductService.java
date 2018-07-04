package portal.shopping.portalshoppingproduct.service.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import portal.shopping.portalshoppingproduct.entity.Product;

@Repository
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	@PersistenceContext
	private EntityManager em;
	
	public Product getProductWithCategory(Long productId) {
		return em.createNamedQuery("PRODUCT.findByIdWithCategory", Product.class).setParameter("id", productId).getSingleResult();
	}
	
	public List<Product> getAllProductWithCategory(){
		return em.createNamedQuery("PRODUCT.findAllWithCategory", Product.class).getResultList();
	}
	
	@Transactional
	public Product update(Product product) {
		return em.merge(product);
	}

}
