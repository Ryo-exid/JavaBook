package treatString;

public class StringBuilderPractice {
	public static void main(String[] args) {
		// 1〜100までの整数をカンマで連結した文字列sを生成するコード
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i + 1).append(","); // appendメソッドで、バッファー（メモリ領域）に文字列を追加
		}
		String s = sb.toString(); // 最後に一度だけtoStringメソッドを呼び、連結させた文字列を取り出す
		System.out.println(s);
		
		// 完成した文字列sをカンマで分割し、String配列aに格納
		String[] a = s.split(",");
		System.out.println(a);
	}
}
