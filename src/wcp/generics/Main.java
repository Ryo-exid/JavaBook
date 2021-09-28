package wcp.generics;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));
		
		appleBasket.printTotalPrice(); // ふじの入った籠は、合計300円です
		peachBasket.printTotalPrice(); // 黄金桃の入った籠は、合計400円です
	}
}
