package regexp;

// replaceAllメソッド：文字列の置換
public class ReplaceAll {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X"); // bかeかhのいずれかに当てはまった文字をXに置換する
		
		System.out.println(w); // aXc,dXf:gXi
	}
}
