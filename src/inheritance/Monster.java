package inheritance;

public class Monster {
	int hp = 50;
	char suffix;
	
	public Monster(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ！");
		h.hp -= 10;
	}
	
	public void run() {
		System.out.println("キノコ" + this.suffix + "は逃げ出した！");
	}
}
