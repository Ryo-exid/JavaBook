package polymorphism2;

public class Thief extends Character {
	public Thief(String name) {
		this.name = name;
		this.hp = 50;
	}
	// オーバーライド
	public void attack(Monster m) {
		System.out.println("盗賊" + this.name + "は" + m.name + "を攻撃した！");
		System.out.println("5ポイントのダメージ！");
		m.hp -= 5;
	}
}
