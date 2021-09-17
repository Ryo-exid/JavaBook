package abstractAndInterface;

// 特に抽象度が高い抽象クラスをインターフェースとして扱う ※条件：①全てのフィールドは抽象メソッドであること ②基本的にフィールドをひとつも持たないこと（定数はOK）
public interface Creature {
	// public abstractは省略（インターフェースに宣言されたメソッドは自動的にpublic abstractになる為）
	void run();
}
