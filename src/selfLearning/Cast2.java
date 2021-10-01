package selfLearning;

public class Cast2 {
	public static void main(String[] args) {
		int a = 1234;
		int b = 5678;
		
		double c = (double)a / b * 100000; // 21733.00457907714
		
		int d = (int)c;

		double e = (double)d / 100000;
		
		System.out.println(a); // 1234
		System.out.println(b); // 5678
		System.out.println(c); // 21733.00457907714
		System.out.println(d); // 21733
		System.out.println(e); // 0.21733
	}
}
