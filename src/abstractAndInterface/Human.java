package abstractAndInterface;

//特に抽象度が高い抽象クラスをインターフェースとして扱う ※条件：①全てのフィールドは抽象メソッドであること ②基本的にフィールドをひとつも持たないこと（定数はOK）
public interface Human {
	// public abstractは省略
	void talk();
	void watch();
	void hear();
	void run();
}
