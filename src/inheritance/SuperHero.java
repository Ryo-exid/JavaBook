package inheritance;

public class SuperHero extends Hero {
	boolean flying;
	
	public void attack(Monster m) {
		super.attack(m); // 親インスタンスのattackメソッドを呼び出し
		// 飛んでいる状態なら2回攻撃
		if (this.flying) {
			super.attack(m);
		}
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println(this.name + "は着陸した！");
	}
	
	// オーバーライド（親クラスにあるメソッドを再定義）
	public void run() {
		System.out.println(this.name + "は撤退した。");
	}
}
