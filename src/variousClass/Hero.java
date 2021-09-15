package variousClass;

public class Hero {
	String name;
	int hp;
	
	// Sword型の変数
	Sword sword; // あるクラスが別クラスをフィールドとして利用している関係を「has-a の関係」という。
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
}
