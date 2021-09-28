package wcp.generics;

import java.math.BigDecimal;

public class Apple extends Fruit {
	Apple(String name, BigDecimal price) {
		super(name, price);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public BigDecimal getPrice() {
		return price;
	}
}
