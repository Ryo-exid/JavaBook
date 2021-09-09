package array;

public class ArrayLength {
	public static void main(String[] args) {
		// 配列の宣言（作成）
		int[] scores = new int[5];
		int num = scores.length;
		System.out.println("要素の数：" + num);
		
		scores[1] = 30;
		System.out.println(scores[1]);
	}
}
