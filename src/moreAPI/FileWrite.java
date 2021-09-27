package moreAPI;

import java.io.FileWriter;

// ファイルに1文字ずつ書き込む
public class FileWrite {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("data.txt"); // ファイルを開く
		fw.write("そ");
		fw.write("れ");
		fw.write("で");
		fw.write("は");
		fw.close();
	}
}
