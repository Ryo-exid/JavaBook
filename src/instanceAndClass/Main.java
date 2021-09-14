package instanceAndClass;

public class Main {
	public static void main(String[] args) {
		// 1.勇者を生成
		Hero h = new Hero(); // Heroクラスからインスタンスを生成し、変数hに入れる
		
		// 2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		Monster m1 = new Monster(); // おばけキノコ1匹目を生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';
		
		Monster m2 = new Monster(); // おばけキノコ2匹目を生成し初期化
		m2.hp = 40;
		m2.suffix = 'B';
		
		// 3.メソッドを呼び出していく
		h.sit(5);
		h.slip();
		m1.run();
		m2.run();
		h.sit(25);
		h.run();
	}
}
