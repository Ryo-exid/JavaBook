package abstractAndInterface;

public class Villager extends Character implements Human {
	// Characterからnameやhpなどのフィールドを継承している。
	
	// コンストラクタ
	public Villager(String name) {
		super(name);
	}
	
	// Characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	
	// さらにHumanから継承した4つの抽象メソッドを実装
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

// implements（実装）とextends（拡張）の使い分け

// 継承元　→　継承先
// クラス　→　クラス  ...extends
// インターフェース　→　クラス  ...implements
// インターフェース　→　インターフェース  ...extends
