package selfLearning;

// 0から10までの偶数を降順に表示
public class EvenReverse {
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
