package abstractAndInterface;

// 抽象クラスはnewによるインスタンス化が禁止される
public abstract class Character {
	String name;
	int hp;
	
	public Character(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	// 継承先でメソッドのオーバーライドを強制させる
	public abstract void attack(Matango m);
}
