package moreAPI;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("data.txt");) { // ファイルを開く/閉じる
			int input = fr.read();
			// ファイルの最後まで1文字ずつ読む
			while (input != -1) {
				System.out.print((char)input + ",");
				input = fr.read();
			}
		} catch (IOException e) {
			e.getMessage(); // エラーメッセージを取得
			e.printStackTrace(); // スタックトレースの内容を出力
		}
	}
}
