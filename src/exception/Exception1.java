package exception;

import java.io.FileWriter;

public class Exception1 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		} catch (Exception e) { // Exceptionの子孫をどれでもキャッチ ※しかし、どのような種類の例外が発生しても同じように処理をするため、大雑把な例外処理になってしまう。
			System.out.println("何らかの例外を補足しました");
		}
	}
}

// ※IOException（ファイルを読み書きできない）やConnectException（ネットワークに接続できない）は、Exceptionを継承している。
