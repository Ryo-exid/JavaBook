package collection;

import java.util.HashMap;
import java.util.Map;

// マップに格納された情報を1つずつ取り出す
public class MapFor {
	public static void main(String[] args) {
		// Map<キーの値, 値の型> マップ変数 = new HashMap<キーの値, 値の型>();
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		
		// ペアで値を格納  ※キーの重複は許されない
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);
		
		for (String key : prefs.keySet()) { // 県名一覧を取得し繰り返す
			int value = prefs.get(key); // 県名（キー）を指定し人口（値）を取得
			System.out.println(key + "の人口は、" + value + "万人");
		}
		
		// ※格納順に取り出したい場合はLinkedHashMap、自然順序で取り出したい場合はTreeMapを利用する
	}
}
