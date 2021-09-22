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
	}
}
