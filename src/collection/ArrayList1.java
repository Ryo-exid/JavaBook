package collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		// ArrayListを準備 ※<>を使った表現はジェネリクスと呼ばれる。<>の中身をHeroやDateに変えることで、どんな種類のインスタンスでも格納可能。また、サイズ指定は不要。
		ArrayList<String> names = new ArrayList<String>();
		
		// 三人を追加
		names.add("田中");
		names.add("鈴木");
		names.add("斉藤");
		
		System.out.println(names.get(1)); // 鈴木
	}
}

// コレクションは、インスタンスでないものを格納できない
