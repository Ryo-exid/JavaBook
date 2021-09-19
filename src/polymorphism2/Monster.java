package polymorphism2;

public abstract class Monster {
	String name;
	int hp;
	public abstract void run();
	public abstract void attack(Character c); // 引数を曖昧な型Characterにすることで中身がHeroでもThiefでもWizardでも対応可能（多様性のメリット）
}
