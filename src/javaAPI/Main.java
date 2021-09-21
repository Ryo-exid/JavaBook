package javaAPI;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("リョウ");
		System.out.println(h1.toString()); // 名前：リョウ / HP：100
		// System.out.println()という命令は、渡されたObjectのtoStringメソッドを呼び出して得られる文字列表現を画面に表示するため、以下も同様の結果となる。
		System.out.println(h1); // 名前：リョウ / HP：100
		
		Hero h2 = new Hero("ゼシカ");
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}
}

// equals() ...等価（同じ内容）かどうかを判定する  ※「==」は等値（同一の存在）であることを判定するものなので違いに注意
