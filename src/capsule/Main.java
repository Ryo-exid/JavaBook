package capsule;

public class Main {
	public static void main(String[] args) {
		SetterValueCheck svc = new SetterValueCheck("ゼシカ");
		System.out.println(svc.getName()); // ゼシカ
		svc.setName("魔法使いゼシカ");
		System.out.println(svc.getName()); // 魔法使いゼシカ
//		svc.setName(""); // エラーメッセージ "名前が短すぎる。処理を中断。"
		
		System.out.println("======================================");
		
		Hero h = new Hero("勇者");
		Wizard w = new Wizard("ゼシカ");
		Wand specialWand = new Wand("特別な魔法の杖");
		specialWand.setPower(50);
		w.setWand(specialWand);
		System.out.println("勇者のHP：" + h.getHp()); // 勇者のHP：100
		w.heal(h); // ゼシカは勇者のHPを500回復した！
		System.out.println("勇者のHP：" + h.getHp()); // 勇者のHP：600
	}
}
