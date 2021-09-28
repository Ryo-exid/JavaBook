package wcp.generics;

import java.math.BigDecimal;

public abstract class Fruit {
	String name;
	BigDecimal price;
	
	Fruit(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	abstract protected String getName();
	abstract protected BigDecimal getPrice();
}
