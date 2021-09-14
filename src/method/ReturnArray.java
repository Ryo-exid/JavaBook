package method;

public class ReturnArray {
	
	// int型配列を作成して戻すメソッド
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray; // 配列を戻す
	}
	
	public static void main(String[] args) {
		int[] array = makeArray(3);
		
		// Arrayの全要素を出力
		for (int i : array) {
			System.out.println(i);
		}
	}
}
