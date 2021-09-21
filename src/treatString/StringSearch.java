package treatString;

// Stringクラスに備わる文字列検索メソッドを利用した例
public class StringSearch {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		
		// 指定した文字列を含んでいるかを調べる
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		
		// 指定した文字列で終わるかどうかを調べる ※始まりはstartsWith()
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		
		// 前から検索して最初に登場した位置を調べる
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		
		// 後ろから検索して最初に登場した位置を調べる
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}
}
