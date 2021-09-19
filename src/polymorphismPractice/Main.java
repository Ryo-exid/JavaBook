package polymorphismPractice;

public class Main {
	public static void main(String[] args) {
		// AクラスとBクラスのインスタンスを要素数2の配列に格納
		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		
		// 配列の中身をループで順に取り出し、それぞれのインスタンスb()を呼び出す
		for (Y y : array) {
			y.b();
		}
	}
}
