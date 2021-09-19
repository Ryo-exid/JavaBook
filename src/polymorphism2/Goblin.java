package polymorphism2;

public class Goblin extends Monster {
	public Goblin(String name) {
		this.name = name;
	    this.hp = 8;
	}
	
	public void run() {
		System.out.println(this.name + "は逃走した。");
	}
	
	public void attack(Character c) {
		System.out.println(this.name + "は" + c.name + "に攻撃した！");
		System.out.println("渾身の一撃！！");
		System.out.println("20のダメージ");
		c.hp -= 20;
	}
}
