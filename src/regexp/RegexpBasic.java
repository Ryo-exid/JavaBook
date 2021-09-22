package regexp;

public class RegexpBasic {
	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.matches("Java")); // true
		System.out.println(s.matches("java")); // false
		
		// ピリオド：任意の1文字であれば良い
		System.out.println("Java".matches("J.va")); // true
	}
}
