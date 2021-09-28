package wcp.innerClass;

public class Main {
	public static void main(String[] args) {
		// 内部クラス / ”蹴る”という文字列を表示させる
		Human human = new Human();
		// ※内部クラスは直接参照できない為、型として用いる際はHuman.HumanLegと外部クラスと共に指定するか、import文を書く
		Human.HumanLeg leg = human.new HumanLeg(); // human.new HumanLeg()と、外部クラスのHumanを使ってインスタンスを作る
		leg.kick();
		
		// 上記は1行で表すことも可能
		new Human().new HumanLeg().kick();
		
		// --------------------------------------------------
		
		// Constants.java
		System.out.println(Constants.Cat.NAME);
		System.out.println(Constants.Cat.LEG_COUNT);
		System.out.println(Constants.Octopus.NAME);
		System.out.println(Constants.Octopus.LEG_COUNT);
	}
}
