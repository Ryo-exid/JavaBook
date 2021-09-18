package abstractAndInterfacePractice;

//会社の資産として保有するもの（コンピュータ）を管理するプログラム
public class Computer {
	// フィールド
	String name;
	int price;
	String color;
	String makerName;
	
	// コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.makerName = makerName;
	}
	
	// メソッド
	public String getname() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }
	public String makerName() { return this.makerName; }
}
