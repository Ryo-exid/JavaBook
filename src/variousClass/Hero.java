package variousClass;

public class Hero {
	String name;
	int hp;
	
	// Sword型の変数
	Sword sword; // あるクラスが別クラスをフィールドとして利用している関係を「has-a の関係」という。
	
	// コンストラクタ①
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	// コンストラクタ② ※オーバーロード
	public Hero() {
		// 同一クラス内の別のコンストラクタの呼び出し
		// this(引数);
		
		this("ダミー"); // コンストラクタ①を呼び出しつつ、this.name = "ダミー"; と書くのと同じ意味
	}
	
	public void attack() {
		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
}
