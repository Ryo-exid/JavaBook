package javaAPI;

// extendsで親クラスを指定しなければ、java.lang.Objectを継承したとみなされる ※ equals(), toString()などのメソッドが定義されている。
public class Hero {
	String name;
	int hp;
	
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}
	
	// 意図する文字列表現を返すようにするには、toStringメソッドをオーバーライドする
	public String toString() {
		return "名前：" + this.name + " / HP：" + this.hp;
	}
}

// ・toString()  ...自分自身の内容の文字列表現を返す
