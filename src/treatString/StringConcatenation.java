package treatString;

// 文字列の連結（＋演算子と比べ、StringBuilderクラスを用いた方が圧倒的に高速）
public class StringConcatenation {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// 文字列を10000回連結する
		for (int i = 0; i < 10000; i++) {
			sb.append("Java"); // appendメソッドで、バッファー（メモリ領域）に文字列を追加
		}
		String s = sb.toString(); // 最後に一度だけtoStringメソッドを呼び、連結させた文字列を取り出す
		System.out.println(s);
	}
}
