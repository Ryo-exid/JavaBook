package method;

public class ArgumentArray {
	public static void main(String[] args) {
		int[] scores = {100, 70, 30};
		printArray(scores); // 配列を渡す
	}
	
	// 引数に配列を受け取り、ずべての要素を表示するメソッド
	public static void printArray(int[] scores) {
		for (int score : scores) {
			System.out.println(score);
		}
	}
}
