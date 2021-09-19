package polymorphism;

public class Wizard extends Character {
	int mp;
	public Wizard(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 20;
	}
	// オーバーロード
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println(m.name + "に3ポイントのダメージ");
		m.hp -= 3;
	}
	// Wizard（魔法使い）独自のメソッド
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println(m.name + "に10ポイントのダメージ");
		m.hp -= 10;
		this.mp -= 5;
	}
}
