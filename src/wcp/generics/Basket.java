package wcp.generics;

import java.math.BigDecimal;

public class Basket<E extends Fruit> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100);
	
	Basket(E e) {
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	void printName() {
		System.out.println("籠の中身は" + elem.getName() + "です");
	}
	
	void printTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName() + "の入った籠は、合計" + totalPrice + "円です");
	}
}
