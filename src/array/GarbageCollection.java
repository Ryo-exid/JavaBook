package array;

public class GarbageCollection {
	public static void main(String[] args) {
		boolean judge = true;
		if (judge == true) {
			int[] arrayG = {1, 2, 3}; // ifブロック内で配列を作成
			System.out.println(arrayG[0]);
		} // この時点で配列arrayはメモリから消滅（事実上メモリ内のゴミ（garbage）となる。）
	}
}
