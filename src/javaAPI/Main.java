package javaAPI;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("リョウ");
		System.out.println(h.toString()); // 名前：リョウ / HP：100
		// System.out.println()という命令は、渡されたObjectのtoStringメソッドを呼び出して得られる文字列表現を画面に表示するため、以下も同様の結果となる。
		System.out.println(h); // 名前：リョウ / HP：100
	}
}
