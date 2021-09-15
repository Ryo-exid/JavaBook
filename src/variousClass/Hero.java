package variousClass;

public class Hero {
	String name;
	int hp;
	
	// Sword型の変数
	Sword sword; // あるクラスが別クラスをフィールドとして利用している関係を「has-a の関係」という。
	
	// コンストラクタ
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	// コンストラクタのオーバーロード
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
	
	public void attack() {
		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
}
