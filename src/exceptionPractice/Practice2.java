package exceptionPractice;

public class Practice2 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) { // parseIntメソッドが発生させる可能性のある例外（APIリファレンスで調べる）
			System.out.println("NumberFormatException例外を補足しました");
		}
	}
}
