package treatString;

// Stringクラスに備わる文字列調査メソッドを利用した例
public class stringSurvey {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		
		// 内容が等しいかを調べる
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		// 大文字・小文字を区別せず内容が等しいか調べる ※大文字と小文字の区別のことをケースという
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		// lengthメソッドは全角も半角も1文字としてカウント
		System.out.println("s1の長さは" + s1.length() + "です");
		
		// 空文字（長さが0か）を調べる
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
	}
}
