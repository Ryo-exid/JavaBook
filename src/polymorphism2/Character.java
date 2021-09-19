package polymorphism2;

public abstract class Character {
	String name;
	int hp;
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	public abstract void attack(Monster m); // 引数を曖昧なMonsterにすることでGoblinでもMatangoでも対応可能（多様性のメリット）
}
