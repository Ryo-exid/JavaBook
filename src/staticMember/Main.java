package staticMember;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("リョウ");
		Hero h2 = new Hero("ゼシカ");
		Hero.money = 100;
		System.out.println(Hero.money); // 100
		System.out.println(h1.money); // 100
		h1.money = 300; // h1に300を代入
		System.out.println(h2.money); // h2でも300と表示
	}
}

// 「h1.money」「h2.money」「Hero.money」は実質どれも同じ箱 ＝ インスタンス間でフィールドを共有できる
