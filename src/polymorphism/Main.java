package polymorphism;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard("ゼシカ");
		Matango ma = new Matango("おばけキノコ");
		w.attack(ma);
		w.fireball(ma);
		System.out.println(ma.name + "の残りHP：" + ma.hp);
		
		Character c1 = w;
		c1.attack(ma);
//		c1.fireball(m);  // エラーになる（Characterという型の箱に入れ直したことで、Characterとして持つメソッドしか呼び出すことができない）
		
		// どうしてもfireballを使いたい場合（ダウンキャスト） ※失敗の危険が伴う
		Character c2 = new Wizard("セニカ");
		Wizard ww = (Wizard)c2; // 曖昧な型（Caracter）だったc2を、強制的に具体的な型（Wizard）として捉える
		ww.fireball(ma);
		
		System.out.println("=============================================");
		
		Slime s = new Slime();
		Monster mo = new Slime();
		
		// 以下、どちらも "スライムはサササッと逃げ出した。" という実行結果になる
		s.run();
		mo.run();
	    //  ※「メソッドの動き」は箱の型（Monster型）ではなく、中身の型（Slime型）で決まる
	}
}

/* キャストしても大丈夫かどうかをチェック（instanceof演算子）
	if (c instanceof SuperHero) {  // もしcの中身がSuperHeroと見なして大丈夫なら...
		SuperHero h = (SuperHero)c;  // SuperHeroと見なせ！
		h.fly();
	}
*/
