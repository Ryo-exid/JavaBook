package abstractAndInterface;

public class Villager extends Character implements Human {
	
	public Villager(String name) {
		super(name);
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	
	public void talk() {
		System.out.println(this.name + "は話す");
	}
	public void watch() {
		System.out.println(this.name + "は見る");
	}
	public void hear() {
		System.out.println(this.name + "は聞く");
	}
	public void run() {
		System.out.println(this.name + "は逃げる");
	}
}
