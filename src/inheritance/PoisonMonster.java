package inheritance;

public class PoisonMonster extends Monster {
	int poisonAttackCount = 5;
	
	public PoisonMonster(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		
		if (this.poisonAttackCount != 0) {
			System.out.println("さらに毒の胞子をばら撒いた！");
			int poisonDamage = h.hp / 5;
			h.hp -= poisonDamage;
			System.out.println(poisonDamage + "ポイントのダメージ！");
			this.poisonAttackCount--;
		}
	}
}
