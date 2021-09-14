package method;

public class Overload {
	
	// 仮引数がの型が異なれば同じ名前のメソッドを複数定義することが許されている。
	
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
	
	// 4つ目のaddメソッド（引数の個数を変える場合）
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void main(String[] args) {
		System.out.println(add(20, 30));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
		System.out.println(add(100, 200, 300));
	}
}
