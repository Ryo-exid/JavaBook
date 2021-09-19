package polymorphism;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard("ゼシカ");
		Matango ma = new Matango("おばけキノコ");
		w.attack(ma);
		w.fireball(ma);
		System.out.println(ma.name + "の残りHP：" + ma.hp);
		
		Character c = w;
		c.attack(ma);
//		c.fireball(m);  // エラーになる（Characterという型の箱に入れ直したことで、Characterとして持つメソッドしか呼び出すことができない）
		
		Slime s = new Slime();
		Monster mo = new Slime();
		
		// 以下、どちらも "スライムはサササッと逃げ出した。" という実行結果になる
		s.run();
		mo.run();
	    //  ※「メソッドの動き」は箱の型（Monster型）ではなく、中身の型（Slime型）で決まる
	}
}
