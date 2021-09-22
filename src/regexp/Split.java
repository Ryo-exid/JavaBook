package regexp;

// splitメソッド：文字列の分割
public class Split {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]"); // カンマかコロンの場所で文字を分割する
		for (String w : words) {
			System.out.print(w + "->"); // abc->def->ghi->
		}
	}
}
