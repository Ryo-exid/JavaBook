package collection;

import java.util.ArrayList;

public class ArrayListFor {
	public static void main(String[] args) {
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("国語");
		subjects.add("数学");
		subjects.add("英語");
		
		// for文を用いたリスト要素の取り出し
		for (int i = 0; i < subjects.size(); i++) { // 要素数を調べるのはlengthではなくsize()
			System.out.println(subjects.get(i)); // 要素を取り出すのはget()
		}
		
		System.out.println("===================");
		
		// 拡張for文
		for (String s : subjects) {
			System.out.println(s);
		}
	}
}
