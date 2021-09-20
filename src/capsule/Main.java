package capsule;

public class Main {
	public static void main(String[] args) {
		SetterValueCheck svc = new SetterValueCheck("ゼシカ");
		System.out.println(svc.getName()); // ゼシカ
		svc.setName("魔法使いゼシカ");
		System.out.println(svc.getName()); // 魔法使いゼシカ
		
		svc.setName(""); // エラーメッセージ "名前が短すぎる。処理を中断。"
	}
}
