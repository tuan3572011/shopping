package portal.shopping.portalshoppingproduct.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import portal.shopping.portalshoppingproduct.entity.Product;
import portal.shopping.portalshoppingproduct.service.repository.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/product/{id}")
	public Object getProductById(@PathVariable("id") Long id) {
		if (id == null) {
			return productService.getAllProductWithCategory();
		}
		return productService.getProductWithCategory(id);
	}

	@GetMapping("/product")
	public Object getAllProduct() {
		return productService.getAllProductWithCategory();
	}

	@PutMapping("/product/{id}")
	public Product updateProductCategory(@PathVariable("id") long id) {
		Product product = productService.getProductWithCategory(id);
		product.setCategories(new ArrayList<>());
		return productService.update(product);
	}

}
