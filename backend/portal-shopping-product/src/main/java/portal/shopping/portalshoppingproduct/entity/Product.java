package portal.shopping.portalshoppingproduct.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name="PRODUCT.findByIdWithCategory", query="FROM Product p JOIN FETCH p.categories WHERE p.id=:id")
@NamedQuery(name="PRODUCT.findAllWithCategory", query="FROM Product p JOIN FETCH p.categories")
public class Product {
	@Id
	private Long id;
	private String name;
	private String description;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="category_product", joinColumns=@JoinColumn(name="product_id"), inverseJoinColumns=@JoinColumn(name="category_id"))
	private List<Category> categories;
	private String images;
	private String thumbnail;
	

}
