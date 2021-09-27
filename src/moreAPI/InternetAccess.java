package moreAPI;

import java.io.InputStream;
import java.net.URL;

// Webページを取得する
public class InternetAccess {
	public static void main(String[] args) throws Exception {
		URL u = new URL("https://www.tokyodisneyresort.jp/"); // java.net.URLクラスのインスタンスを生成
		InputStream is = u.openStream(); // インターネットへ接続（openStreamメソッドを呼び出す）
		int i = is.read();
		while (i != -1 ) { // ページの終わりまで繰り返す
			char c = (char)i;
			System.out.print(c); // 読んだ内容を画面に表示（HTMLのテキスト）
			i = is.read();
		}
	}
}
