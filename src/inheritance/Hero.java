package inheritance;

import instanceAndClass.Monster;

public class Hero {
	String name;
	int hp;
	
	// 戦う
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
//		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	// finalがついているメソッドは子クラスでオーバーライドできない（classの定義にfinalがついていたらクラスそのものが継承できないようになる）
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
}
