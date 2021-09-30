package lambda;

@FunctionalInterface // 関数型インターフェース（実装すべき抽象メソッドが一つしかないインターフェース）であることを明示
public interface Greeting {
	public String hello(); //　抽象メソッド一つのみ
}
