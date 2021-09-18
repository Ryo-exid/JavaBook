package abstractAndInterfacePractice;

// 会社の資産として保有するもの（本）を管理するプログラム
public class Book extends TangibleAsset {
	// フィールド
	String isbn; // ISBN：国際標準図書番号
	
	// コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	// メソッド
	public String getIsbn() { return this.isbn; }
}
