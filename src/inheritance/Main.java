package inheritance;

public class Main {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		sh.name = "スーパーヒーロー";
		sh.run();
		
		Monster m1 = new Monster("クリボー");
		
		sh.fly();
		sh.attack(m1); // flyingがtrueの間は2回攻撃
		sh.land();
	}
}
