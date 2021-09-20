package capsule;

public class Wand {
	private String name; // 杖の名前
	private double power; // 杖の魔力
	
	public Wand(String name) {
		this.name = name;
		this.power = 20;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖の名前は3文字以上で設定してください。");
		}
		this.name = name;
	}
	
	public double getPower() {
		return this.power;
	}
	
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖の魔力は0.5以上100未満で設定してください。");
		}
		this.power = power;
	}
}
