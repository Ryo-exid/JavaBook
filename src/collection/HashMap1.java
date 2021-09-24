package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		// Map<キーの値, 値の型> マップ変数 = new HashMap<キーの値, 値の型>();
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		
		// ペアで値を格納  ※キーの重複は許されない
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		int tokyo = prefs.get("東京都"); // キーを指定し値を取得
		System.out.println("東京都の人口は、" + tokyo + "万人");
		
		prefs.remove("京都府"); // 指定した要素の削除
		prefs.put("熊本県", 182); // 182に上書き
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto + "万人");
	}
}
