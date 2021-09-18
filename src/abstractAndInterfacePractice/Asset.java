package abstractAndInterfacePractice;

// 資産（Asset）抽象クラス
public abstract class Asset {
	String name;
	int price;
	String color;
	
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
}
