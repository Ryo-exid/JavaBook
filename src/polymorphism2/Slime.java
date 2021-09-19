package polymorphism2;

public class Slime extends Monster {
	public Slime(String name) {
		this.name = name;
	    this.hp = 5;
	}
	
	public void run() {
		System.out.println(this.name + "は逃げた。");
	}
	
	public void attack(Character c) {
		System.out.println(this.name + "は" + c.name + "に攻撃した！");
		System.out.println("5のダメージ");
		c.hp -= 5;
	}
}
