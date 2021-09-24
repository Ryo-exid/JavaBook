package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		
		// Setはどのような順序で要素が取り出されるかは一切保証されていない
		for (String s : colors) {
			System.out.print(s + " → ");
		}
	}
}

// Setの基本特性
// ・それぞれの要素には重複が許されない。
// ・それぞれの要素には基本的に順序関係がない。
// ・get()やset()がない。
