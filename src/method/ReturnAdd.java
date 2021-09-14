package method;

public class ReturnAdd {
	public static void main(String[] args) {
		System.out.println(add(add(10, 20), add(30,40))); // 100
	}
	
	// addメソッド
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
}
