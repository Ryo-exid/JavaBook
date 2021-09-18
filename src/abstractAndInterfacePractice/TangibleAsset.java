package abstractAndInterfacePractice;

// コンピュータと本以外にも様々な資産を管理していく場合に有効な「有形資産（TangibleAsset）抽象クラス」
public abstract class TangibleAsset extends Asset implements Thing {
	double weight;
	
	public TangibleAsset(String name, int price, String color) {
		super(name, price, color);
	}
	
	public String getColor() { return this.color; }
	
	// Thingインターフェースの抽象メソッドをオーバーライド
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
