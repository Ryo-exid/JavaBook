package variousClass;

// 回復魔法を使えるWizard（魔法使い）クラス
public class Wizard {
	String name;
	int hp;
	
	// クラス型をメソッド引数に用いる
	public void heal (Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}
