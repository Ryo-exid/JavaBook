package array;

public class ScoreManagement {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		
		int sumScore = 0; // 集計結果を入れるための変数を初期化して準備
		
		for (int i = 0; i < scores.length; i++) {
			sumScore += scores[i]; // 一つずつ変数sumScoreに合算
		}
		
		int avgScore = sumScore / scores.length;
		
		System.out.println("合計点：" + sumScore);
		System.out.println("平均点：" + avgScore);
		
	}
}
