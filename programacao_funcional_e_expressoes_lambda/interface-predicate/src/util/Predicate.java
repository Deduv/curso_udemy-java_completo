package util;

import model.entities.Product;

public class Predicate implements java.util.function.Predicate<Product>{

	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}
	
}
