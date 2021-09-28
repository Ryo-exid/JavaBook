package wcp.enumeration;

// 列挙型（Enum） ※プログラムの中で定義する定数を拡張し、さらに安全かつ便利にする仕組み
public enum Dessert {
	// 定数を列挙（それぞれに値段を指定する）
	APPLE(100), ICE_CREAM(200), CAKE(300),;
	
	// フィールド
	private int price;
	
	// コンストラクタ
	private Dessert(int price) {
		this.price = price;
	}
	
	// ゲッター
	public int getPrice() {
		return price;
	}
}
