package capsule;

public class SetterValueCheck {
	// private：自分自身のクラスのみアクセスを許可
	private String name;
	
	// コンストラクタ
	public SetterValueCheck(String name) {
		this.name = name;
	}
	
	// ゲッター
	public String getName() {
		return this.name;
	}
	
	// セッターの中で値の妥当性をチェックする
	public void setName(String name) {
		if (name == null) { // 名前にnullが代入されそうになった
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if (name.length() <= 1) { // 短すぎる名前が設定されそうになった
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if (name.length() >= 20) { // 長すぎる名前が設定されそうになった
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name; // 検査完了。代入しても大丈夫。
	}
}
