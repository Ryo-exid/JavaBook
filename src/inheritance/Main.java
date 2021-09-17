package inheritance;

public class Main {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero("スーパーヒーロー");
		PoisonMonster pm = new PoisonMonster('A');
		
		pm.attack(sh);
		sh.fly();
		sh.attack(pm); // flyingがtrueの間は2回攻撃
		sh.land();
		pm.run();
		sh.run();
	}
}
