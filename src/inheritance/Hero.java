package inheritance;

public class Hero {
	String name;
	int hp;
	
	// 子クラス（SuperHeroクラス）のインスタンスを生成した時、必ず親クラス（Heroクラス）のコンストラクタも呼び出される
	public Hero(String name) {
		this.name = name;
	}
	
	// 戦う
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println(this.name + "は" + m.name + "に5ポイントのダメージを与えた！");
		System.out.println(m.name + "の残りHP：" + m.hp);
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
