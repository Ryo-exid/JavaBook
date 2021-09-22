package regexp;

public class RegexpBasic {
	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.matches("Java")); // true
		System.out.println(s.matches("java")); // false
		
		// ピリオド：任意の1文字であれば良い
		System.out.println("Java".matches("J.va")); // true
		
		// アスタリスク：直前の文字の0回以上の繰り返し
		System.out.println("Jaaaaava".matches("Ja*va")); // true
		System.out.println("あいうxx019".matches(".*")); // true
		
		// endsWith()やstartsWith()の代わりとして文字列の判定に利用可能
		s.matches("Ma.*"); // Maで始まる任意の文字
		s.matches(".*ful"); // fulで終わる任意の文字
		
		String greet = "HELLLO";
		// 波カッコ：指定回数の繰り返し
		System.out.println(greet.matches("HEL{3}O")); // true
		
		// 角カッコ：いずれかの文字
		System.out.println(s.matches("Ja[cvn]a")); // 1文字目がJ、2文字目がa、3文字目がcかvかnのいずれかであること、4文字目がa
		
		// 角カッコ内のハイフン：範囲指定のいずれかの文字
		"url".matches("[a-z]{3}"); // a〜zのいずれか3文字
		
		// ハット（^）とダラー（$）：先頭と末尾
		"joooooy".matches("^j.*y$"); // 先頭文字がjで、最後の文字がpの、任意の長さの文字列
	}
}

// パターン記述
// ¥d  ...いずれかの数字（[0-9]と同じ）
// ¥w  ...英字・数字・アンダーバー（[a-zA-Z_0-9]と同じ）
// ¥s  ...空白文字（スペース、タブ文字、空白文字など） ※¥という記号を文字として含めたい場合は¥¥
