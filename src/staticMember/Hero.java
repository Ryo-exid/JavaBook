package staticMember;

public class Hero {
	String name; // 個々のインスタンス毎に用意
	int hp; // 個々のインスタンス毎
	static int money; // クラスに対して一つだけ用意される（インスタンス間で共有） ※クラス変数とも呼ばれる（インスタンスをnewしなくても静的フィールドは利用可能）
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	// 「勇者たちの所持金をランダムに設定する」メソッド ※staticの付くメソッドは"静的メソッド"または"クラスメソッド"と呼ばれる
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}
}
