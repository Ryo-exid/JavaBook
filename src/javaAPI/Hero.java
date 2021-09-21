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
	
	// 名前が同じなら同じ勇者とみなすequals()  ※オーバーライド
	public boolean equals(Object o) {
		if (this == o) {
			return true; // 等値（同一の存在）なら間違いなく等価
		}
		if (o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) { // 等しければ等価（同じ内容であること）
				return true;
			}
		}
		return false;
	}
}

// ・toString()  ...自分自身の内容の文字列表現を返す
// ・equals() ...等価（同じ内容）かどうかを判定する  ※「==」は等値（同一の存在）であることを判定するものなので違いに注意
