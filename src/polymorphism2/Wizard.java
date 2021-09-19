package polymorphism2;

public class Wizard extends Character {
	int mp;
	public Wizard(String name) {
		this.name = name;
		this.hp = 40;
		this.mp = 30;
	}
	// オーバーライド
	public void attack(Monster m) {
		System.out.println("魔法使い" + this.name + "は" + m.name + "を攻撃した！");
		System.out.println("3ポイントのダメージ！");
		m.hp -= 3;
	}
	// 魔法使い独自のメソッド
	public void meteor(Monster m) {
		System.out.println("魔法使い" + this.name + "はメテオを放った！");
		System.out.println("20ポイントのダメージ！");
		this.mp -= 5;
		m.hp -= 20;
	}
}
