package abstractAndInterfacePractice;

//会社の資産として保有するもの（コンピュータ）を管理するプログラム
public class Computer extends TangibleAsset {
	// フィールド
	String makerName;
	
	// コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	// メソッド
	public String makerName() { return this.makerName; }
}
