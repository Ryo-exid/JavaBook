package inheritance;

public class SuperHero extends Hero {
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着陸した！");
	}
	
	// オーバーライド（親クラスにあるメソッドを再定義）
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
}
