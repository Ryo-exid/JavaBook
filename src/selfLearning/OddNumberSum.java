package selfLearning;

// 1から100までの奇数の和を求めるプログラム
public class OddNumberSum {
	public static void main(String[] args) {
		int sum = 0;		
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
