package portal.shopping.portalshoppingproduct.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {
	@Id
	private Long id;
	private String name;
	@JsonIgnore
	@ManyToMany(mappedBy="categories")
	private List<Product> products = new ArrayList<>();
	

}
