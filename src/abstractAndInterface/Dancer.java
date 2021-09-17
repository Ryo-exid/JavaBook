package abstractAndInterface;

public class Dancer extends Character {
	
	public Dancer(String name) {
		super(name); // 親クラスのコンストラクタ
	}
	
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った！");
	}
	
	// 抽象メソッドのため、必ずオーバーライドする
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println(m.name + "に3ポイントのダメージ！");
		m.hp -= 3;
	}
}
