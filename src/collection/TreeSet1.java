package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("panda");
		words.add("rabbit");
		
		// 自然順序付け（Stringクラスだったら辞書順）で整列
		for (String s : words) {
			System.out.print(s + " → "); // cat → dog → panda → rabbit → 
		}
	}
}

// 順序が保証されるSetバリエーション
// ・LinkedHashSet：値を格納した順序に整列
// ・TreeSet：自然順序付け（Stringクラスだったら辞書順）で整列
