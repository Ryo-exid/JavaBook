package polymorphism2;

public class Matango extends Monster {
	int mp;
	
	public Matango(String name) {
		this.name = name;
	    this.hp = 25;
	    this.mp = 10;
	}
	// オーバーライド
	public void run() {
		System.out.println(this.name + "は即座に逃げ出した！");
	}
	
	// 独自のメソッド
	public void attack(Character c) {
		if (this.mp > 0) {
			System.out.println(this.name + "は" + c.name + "に攻撃した！");
			System.out.println("毒が" + c.name + "を襲う！");
			System.out.println("8のダメージ");
			c.hp -= 8;
			this.mp -= 5;
		} else {
			System.out.println(this.name + "は" + c.name + "に攻撃した！");
			System.out.println("5のダメージ");
			c.hp -= 5;
		}
	}
}
