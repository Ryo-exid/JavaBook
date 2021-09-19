package polymorphism2;

public class Main {
	public static void main(String[] args) {
		// 5人１組のパーティ
		Character[] c = new Character[5];
		c[0] = new Hero("勇者1");
		c[1] = new Hero("勇者2");
		c[2] = new Thief("盗賊1");
		c[3] = new Wizard("魔法使い1");
		c[4] = new Wizard("魔法使い2");
		
		// 宿屋に泊まると味方全員のHPが50回復
		for (Character ch : c) {
			ch.hp += 50;
		}
		
		Monster[] monsters = new Monster[3];
		monsters[0] = new Matango("毒キノコ");
		monsters[1] = new Goblin("ゴブリン");
		monsters[2] = new Slime("スライム");
		
		// 同じ指示で異なる動作をさせることができる
		for (Monster m : monsters) {
			m.attack(c[0]);
		}
		
		System.out.println(c[0].name + "の残りHP：" + c[0].hp);
	}
}
