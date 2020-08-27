package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
	
	private Integer  id;
	private String   name;
	private Category category;
	
    public Product(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
    
	@Override
	public String toString() {
		return "Product ["+ id + ", " + name + " , " + category + "]";
	}

}
