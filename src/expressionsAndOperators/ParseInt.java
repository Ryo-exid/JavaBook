package expressionsAndOperators;

public class ParseInt {
	public static void main(String[] args) {
		String age = "25";
		int n = Integer.parseInt(age); // 文字列をInt型の整数に変換
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
	}
}
