package staticMember;

public class Hero {
	String name; // 個々のインスタンス毎に用意
	int hp; // 個々のインスタンス毎
	static int money; // クラスに対して一つだけ用意される（インスタンス間で共有） ※クラス変数とも呼ばれる（インスタンスをnewしなくても静的フィールドは利用可能）
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
}
