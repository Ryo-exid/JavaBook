package selfLearning;

// 1,2,3,4,5,6,7,8,9,10と出力する ※文末にカンマを含めない
public class NoEndComma {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < num.length; i++) {
			if (i != 9) {
				System.out.print(num[i] + ",");
			} else {
				System.out.print(num[i]);
			}
		}
	}
}
