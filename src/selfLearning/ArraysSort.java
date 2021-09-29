package selfLearning;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] num = {3, 5, 2, 7, 1, 8};
		Arrays.sort(num); // 配列を昇順に並び替え
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
