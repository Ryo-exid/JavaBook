package wcp.generics;

import java.math.BigDecimal;

public class Peach extends Fruit {
	Peach(String name, BigDecimal price) {
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
