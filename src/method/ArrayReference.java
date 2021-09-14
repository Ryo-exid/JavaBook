package method;

public class ArrayReference {
	
	// int型配列を受け取り、配列内の要素全てに1を加えるメソッド（returnを返していない）
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);
		
		// arrayの全要素を出力
		for (int i : array) {
			System.out.println(i);
		}
	}
}
