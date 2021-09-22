package treatString;

// formatメソッド：書式を指定した文字列の組み立て
public class Format {
	public static void main(String[] args) {
		// 桁を揃えてキャラクターを表示する
//		final String FORMAT = "%-9 %-13s 所持金%,6d";
//		String s = String.format(FORMAT, hero.getName(), hero.getJob(), Hero.getGold());
//		System.out.println(s);
		
		// format()を使って文字列を作ると同時に画面に出力したい時
		System.out.printf("製品番号%s-%02d", "SJV", 3); // 製品番号SJV-03
		
		// ※format()やprintf()には必要に応じて引数をいくつでも渡すことができる（可変長引数という仕組みで宣言されているため）
	}
}

// System.out.printf(書式文字列, パラメータ...);
