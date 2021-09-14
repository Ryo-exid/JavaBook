package instanceAndClass;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	// MPを5消費することで自分自身のHPを最大HPまで回復できるメソッド
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println(this.name + "HPが最大まで回復した！");
	}
	
	// 祈った秒数にランダムで0〜2ポイントの補正を加えた量回復できるメソッド ※最大MPより回復することはない
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間、天に祈った！");
		int recovery = new Random().nextInt(3) + sec; // 回復量（乱数）
		int recoverActual = Math.min(this.MAX_MP - this.mp, recovery); // 実際の回復量
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
	}
}
