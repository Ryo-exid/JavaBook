package array;

public class Practice1 {
	public static void main(String[] args) {
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		// ------------------------------------
		int[] moneyList = {121902, 8302, 55100};
		
		// for文で取り出す
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		
		System.out.println("---------------------------");
		
		// 拡張for文で取り出す
		for (int money : moneyList) {
			System.out.println(money);
		}
	}
}
