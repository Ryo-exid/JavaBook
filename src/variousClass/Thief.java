package variousClass;

public class Thief {
	String name;
	int hp;
	int mp;
	
	// 名前・HP・MPを指定してインスタンス化できるコンストラクタ
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	// 名前とHPだけ指定できるコンストラクタ ※MPの初期値5
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	// 名前だけ指定できるコンストラクタ ※初期値はHP40、MP5
	public Thief(String name) {
		this(name, 40);
	}
}
