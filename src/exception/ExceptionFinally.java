package exception;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionFinally {
	public static void main(String[] args) {
		FileWriter fw = null; // 例外が生じた場合に備えてnullを代入し、初期化しておく。
		try {
			fw = new FileWriter("data2.txt");
			fw.write("Good morning!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally { // 後付け処理もtry-catchする（18行目がIOExceptionを発生させる可能性があるメソッドであるため）
			// fwがnullではない時だけclose()を試みる ※10行目で例外が発生すると、fwにはnullが入っているためNullPointerExceptionが発生してしまう＝nullということはファイルのオープンに失敗しているためcloseする必要がない
			if (fw != null) {
				try {
					fw.close(); // IOExceptionを発生させる可能性があるメソッド
				} catch(IOException e) {
					; // 空文（ここでは何もしない） ※「ファイルが閉じられない」時にできることはない
				}
			}
		}
	}
}

// もっと上記がシンプルになるコード → TryWithResources.java
