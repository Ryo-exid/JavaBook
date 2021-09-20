package capsule;

public class Hero {
	private String name;
	private int hp;
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
}
