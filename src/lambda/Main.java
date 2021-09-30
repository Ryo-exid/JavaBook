package lambda;

public class Main {
	public static void main(String[] args) {
		// ラムダ式を使ってhelloメソッドを実装
		Greeting greeting = () -> {
			return "こんにちは";
		};
		System.out.println(greeting.hello());
	}
}
