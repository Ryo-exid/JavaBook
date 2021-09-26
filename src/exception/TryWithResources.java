package exception;

import java.io.FileWriter;

public class TryWithResources {
	public static void main(String[] args) {
		// tryの直後に丸カッコで囲まれた部分に複数の文を記述可能（try-with-resources文）。ここで開かれたファイルやデータベース接続などは、自動的にcloseメソッドが呼び出される。
		try (FileWriter fw = new FileWriter("data3.txt");) { // try-catch文を抜ける際に、自動的にclose()が呼び出されるので、finallyブロックの記述は不要
			fw.write("Good evening!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}
	}
}

// 自動的にcloseされるのは、java.lang.AutoCloseableインターフェースを実装しているクラスに限られる。
// ファイル操作やデータベース接続、ネットワーク接続に用いるAPIクラスの多くはAutoCloseableを実装しているため、try-with-resources文での簡潔な記述が可能。
