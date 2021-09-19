package polymorphism2;

public class Hero extends Character {
	public Hero (String name) {
		this.name = name;
		this.hp = 100;
	}
	// オーバーライド
	public void attack(Monster m) {
		System.out.println("勇者" + this.name + "は" + m.name + "を攻撃した！");
		System.out.println("10ポイントのダメージ！");
		m.hp -= 10;
	}
}
