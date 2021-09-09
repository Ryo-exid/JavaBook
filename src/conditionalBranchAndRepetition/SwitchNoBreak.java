package conditionalBranchAndRepetition;

public class SwitchNoBreak {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
		    // fortuneが1か2なら
		    case 1:
		    case 2:
		    	System.out.println("いいね！");
		    	break;
		    // fortuneが3なら
		    case 3:
		    	System.out.println("普通です");
		    	break;
		    // fortuneが4か5なら
		    case 4:
		    case 5:
		    	System.out.println("うーん・・・");
		}
	}
}
