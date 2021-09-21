package treatString;

// 文字列切り出しメソッド
public class StringCut {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は " + s1.substring(3)); // a programming
		System.out.println("文字列s1の4〜8文字目は " + s1.substring(3, 8)); // a pro  ※指定位置8文字目は含まれない
		
		// 指定位置の1文字目を切り出す
		System.out.println(s1.charAt(0)); // J
	}
}
