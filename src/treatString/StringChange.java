package treatString;

// 文字列変換メソッド
public class StringChange {
	public static void main(String[] args) {
		String s1 = "Java programming";
		String s2 = "   Hello, World!   ";
		
		// 大文字を小文字に変換する
		System.out.println(s1.toLowerCase()); // java programming
		
		// 小文字を大文字に変換する
		System.out.println(s1.toUpperCase()); // JAVA PROGRAMMING
		
		// 前後の余白やタブ文字（¥t）を除去する ※全角スペースは除去されないので注意
		System.out.println(s2.trim()); // Hello, World!
		
		// 文字列を置き換える
		System.out.println(s2.replace("Hello", "Good morning")); //    Good morning, World!   
	}
}
