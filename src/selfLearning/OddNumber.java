package selfLearning;

// 奇数判定プログラム
public class OddNumber {
	public static void main(String[] args) {
		int num = 100;
		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
