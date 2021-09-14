package method;

public class Overload1 {
	
	// 仮引数が異なれば同じ名前のメソッドを複数定義することが許されている。
	
	// 1つ目のaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	
	// 2つ目のaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	
	// 3つ目のaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		System.out.println(add(20, 30));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
	}
}
