package capsule;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard(String name) {
		this.hp = 50;
		this.mp = 30;
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0; // HPが負の値でセットされた場合は自動的に0が設定される
		} else {
			this.hp = hp;
		}
	}
	
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("MPには0以上の整数を設定してください。");
		}	
		this.mp = mp;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いの名前は3文字以上で設定してください。");
		}
		this.name = name;
	}
	
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("設定しようとしている杖がnullです。");
		}
		this.wand = wand;
	}
	
	public void heal(Hero h) {
		int basePoint = 10; // 基本回復ポイント
		int recovPoint = (int)(basePoint * this.getWand().getPower()); // 杖による増幅
		h.setHp(h.getHp() + recovPoint); //　勇者のHPを回復する
		System.out.println(this.name + "は" + h.getName() + "のHPを" + recovPoint + "回復した！");
	}
}
