package polymorphism;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard("ゼシカ");
		Matango m = new Matango("おばけキノコ");
		w.attack(m);
		w.fireball(m);
		System.out.println(m.name + "の残りHP：" + m.hp);
		
		Character c = w;
		c.attack(m);
//		c.fireball(m);  // エラーになる（Characterという型の箱に入れ直したことで、Characterとして持つメソッドしか呼び出すことができない）
	}
}
