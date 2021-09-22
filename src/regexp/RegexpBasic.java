package regexp;

public class RegexpBasic {
	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.matches("Java")); // true
		System.out.println(s.matches("java")); // false
	}
}
