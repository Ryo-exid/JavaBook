package wcp.innerClass;

// 内部クラス（1ファイルの中に複数のクラスを持つことが可能）
public class Human {
	public class HumanLeg {
		public void kick() {
			System.out.println("蹴る");
		}
	}
}
